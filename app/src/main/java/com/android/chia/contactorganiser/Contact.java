package com.android.chia.contactorganiser;

import android.net.Uri;

/**
 * Created by Chia on 23/02/15.
 */
public class Contact {
    private String name, phone, email, address;
    private int id;
    private Uri imageURI;

    public Contact(int id, String name, String phone, String email, String address, Uri imageURI){
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.imageURI = imageURI;
        this.id = id;
    }

    public int getId() {return id;}

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Uri getImageURI() {
        return imageURI;
    }
}
