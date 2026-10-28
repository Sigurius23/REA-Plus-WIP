package p618xk;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: xk.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C38422m extends AbstractC38411b {

    /* JADX INFO: renamed from: E */
    public static final UriMatcher f164492E;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f164492E = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C38422m(ContentResolver contentResolver, Uri uri) {
        super(1, uri, contentResolver);
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: b */
    public final Class mo33598b() {
        return InputStream.class;
    }

    @Override // p618xk.AbstractC38411b
    /* JADX INFO: renamed from: g */
    public final void mo123039g(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    @Override // p618xk.AbstractC38411b
    /* JADX INFO: renamed from: h */
    public final Object mo123040h(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        Uri uriLookupContact;
        InputStream inputStreamOpenContactPhotoInputStream;
        int iMatch = f164492E.match(uri);
        if (iMatch == 1) {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact != null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        } else if (iMatch == 3) {
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        } else if (iMatch != 5) {
            inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uri);
        } else {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact != null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        }
        if (inputStreamOpenContactPhotoInputStream != null) {
            return inputStreamOpenContactPhotoInputStream;
        }
        throw new FileNotFoundException(AbstractC31061c.m95637m(uri, "InputStream is null for "));
    }
}
