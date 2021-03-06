package com.stardust.express.app.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayOutputStream;

/**
 * Created by Sylar on 15/5/14.
 */
public class BitmapUtils {

    public static Bitmap getBitmapWithNewSize(String path, int newWidth, int newHeight) {

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        BitmapFactory.decodeFile(path, options);
        options.inSampleSize = Math.max(options.outWidth / newWidth,
                options.outHeight / newHeight);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(path, options);
    }

    public static byte[] compressImage(String file, double maxSize) {
        Bitmap bitmap = BitmapFactory.decodeFile(file);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        int options = 100;
        while (baos.toByteArray().length > maxSize) {
            baos.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, options, baos);
            options -= 10;
            if (options <= 0) {
                break;
            }
        }
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return baos.toByteArray();
    }


    public static ByteArrayOutputStream compressImage(String file) {
        Bitmap bitmap = BitmapFactory.decodeFile(file);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int options = 20;
        bitmap.compress(Bitmap.CompressFormat.JPEG, options, baos);
        return baos;
    }
}
