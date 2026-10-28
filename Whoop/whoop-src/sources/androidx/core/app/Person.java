package androidx.core.app;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
import p479s4.AbstractC32126g;

/* JADX INFO: loaded from: classes5.dex */
public class Person {
    private static final String ICON_KEY = "icon";
    private static final String IS_BOT_KEY = "isBot";
    private static final String IS_IMPORTANT_KEY = "isImportant";
    private static final String KEY_KEY = "key";
    private static final String NAME_KEY = "name";
    private static final String URI_KEY = "uri";
    IconCompat mIcon;
    boolean mIsBot;
    boolean mIsImportant;
    String mKey;
    CharSequence mName;
    String mUri;

    public static class Api22Impl {
        private Api22Impl() {
        }

        public static Person fromPersistableBundle(PersistableBundle persistableBundle) {
            return new Builder().setName(persistableBundle.getString(Person.NAME_KEY)).setUri(persistableBundle.getString(Person.URI_KEY)).setKey(persistableBundle.getString(Person.KEY_KEY)).setBot(persistableBundle.getBoolean(Person.IS_BOT_KEY)).setImportant(persistableBundle.getBoolean(Person.IS_IMPORTANT_KEY)).build();
        }

        public static PersistableBundle toPersistableBundle(Person person) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = person.mName;
            persistableBundle.putString(Person.NAME_KEY, charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString(Person.URI_KEY, person.mUri);
            persistableBundle.putString(Person.KEY_KEY, person.mKey);
            persistableBundle.putBoolean(Person.IS_BOT_KEY, person.mIsBot);
            persistableBundle.putBoolean(Person.IS_IMPORTANT_KEY, person.mIsImportant);
            return persistableBundle;
        }
    }

    public static class Api28Impl {
        private Api28Impl() {
        }

        public static Person fromAndroidPerson(android.app.Person person) {
            IconCompat iconCompatM100041f;
            Builder name = new Builder().setName(person.getName());
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f5264k;
                iconCompatM100041f = AbstractC32126g.m100041f(icon);
            } else {
                iconCompatM100041f = null;
            }
            return name.setIcon(iconCompatM100041f).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }

        public static android.app.Person toAndroidPerson(Person person) {
            return new android.app.Person.Builder().setName(person.getName()).setIcon(person.getIcon() != null ? person.getIcon().m3687k(null) : null).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }
    }

    public static class Builder {
        IconCompat mIcon;
        boolean mIsBot;
        boolean mIsImportant;
        String mKey;
        CharSequence mName;
        String mUri;

        public Builder() {
        }

        public Person build() {
            return new Person(this);
        }

        public Builder setBot(boolean z4) {
            this.mIsBot = z4;
            return this;
        }

        public Builder setIcon(IconCompat iconCompat) {
            this.mIcon = iconCompat;
            return this;
        }

        public Builder setImportant(boolean z4) {
            this.mIsImportant = z4;
            return this;
        }

        public Builder setKey(String str) {
            this.mKey = str;
            return this;
        }

        public Builder setName(CharSequence charSequence) {
            this.mName = charSequence;
            return this;
        }

        public Builder setUri(String str) {
            this.mUri = str;
            return this;
        }

        public Builder(Person person) {
            this.mName = person.mName;
            this.mIcon = person.mIcon;
            this.mUri = person.mUri;
            this.mKey = person.mKey;
            this.mIsBot = person.mIsBot;
            this.mIsImportant = person.mIsImportant;
        }
    }

    public Person(Builder builder) {
        this.mName = builder.mName;
        this.mIcon = builder.mIcon;
        this.mUri = builder.mUri;
        this.mKey = builder.mKey;
        this.mIsBot = builder.mIsBot;
        this.mIsImportant = builder.mIsImportant;
    }

    public static Person fromAndroidPerson(android.app.Person person) {
        return Api28Impl.fromAndroidPerson(person);
    }

    public static Person fromBundle(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(ICON_KEY);
        return new Builder().setName(bundle.getCharSequence(NAME_KEY)).setIcon(bundle2 != null ? IconCompat.m3677a(bundle2) : null).setUri(bundle.getString(URI_KEY)).setKey(bundle.getString(KEY_KEY)).setBot(bundle.getBoolean(IS_BOT_KEY)).setImportant(bundle.getBoolean(IS_IMPORTANT_KEY)).build();
    }

    public static Person fromPersistableBundle(PersistableBundle persistableBundle) {
        return Api22Impl.fromPersistableBundle(persistableBundle);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        String key = getKey();
        String key2 = person.getKey();
        if (key == null && key2 == null) {
            return Objects.equals(Objects.toString(getName()), Objects.toString(person.getName())) && Objects.equals(getUri(), person.getUri()) && Boolean.valueOf(isBot()).equals(Boolean.valueOf(person.isBot())) && Boolean.valueOf(isImportant()).equals(Boolean.valueOf(person.isImportant()));
        }
        return Objects.equals(key, key2);
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public String getKey() {
        return this.mKey;
    }

    public CharSequence getName() {
        return this.mName;
    }

    public String getUri() {
        return this.mUri;
    }

    public int hashCode() {
        String key = getKey();
        return key != null ? key.hashCode() : Objects.hash(getName(), getUri(), Boolean.valueOf(isBot()), Boolean.valueOf(isImportant()));
    }

    public boolean isBot() {
        return this.mIsBot;
    }

    public boolean isImportant() {
        return this.mIsImportant;
    }

    public String resolveToLegacyUri() {
        String str = this.mUri;
        if (str != null) {
            return str;
        }
        if (this.mName == null) {
            return "";
        }
        return "name:" + ((Object) this.mName);
    }

    public android.app.Person toAndroidPerson() {
        return Api28Impl.toAndroidPerson(this);
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public Bundle toBundle() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence(NAME_KEY, this.mName);
        IconCompat iconCompat = this.mIcon;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.f5265a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.f5266b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.f5266b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.f5266b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f5266b);
                    break;
            }
            bundle.putInt("type", iconCompat.f5265a);
            bundle.putInt("int1", iconCompat.f5269e);
            bundle.putInt("int2", iconCompat.f5270f);
            bundle.putString("string1", iconCompat.f5274j);
            ColorStateList colorStateList = iconCompat.f5271g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f5272h;
            if (mode != IconCompat.f5264k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle(ICON_KEY, bundle);
        bundle2.putString(URI_KEY, this.mUri);
        bundle2.putString(KEY_KEY, this.mKey);
        bundle2.putBoolean(IS_BOT_KEY, this.mIsBot);
        bundle2.putBoolean(IS_IMPORTANT_KEY, this.mIsImportant);
        return bundle2;
    }

    public PersistableBundle toPersistableBundle() {
        return Api22Impl.toPersistableBundle(this);
    }
}
