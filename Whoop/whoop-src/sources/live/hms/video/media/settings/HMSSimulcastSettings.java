package live.hms.video.media.settings;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\f\rB!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, m65681d2 = {"Llive/hms/video/media/settings/HMSSimulcastSettings;", "", "low", "Llive/hms/video/media/settings/HMSSimulcastSettings$Item;", "medium", "high", "<init>", "(Llive/hms/video/media/settings/HMSSimulcastSettings$Item;Llive/hms/video/media/settings/HMSSimulcastSettings$Item;Llive/hms/video/media/settings/HMSSimulcastSettings$Item;)V", "getLow", "()Llive/hms/video/media/settings/HMSSimulcastSettings$Item;", "getMedium", "getHigh", "Item", "Builder", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSSimulcastSettings {
    private final Item high;
    private final Item low;
    private final Item medium;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Llive/hms/video/media/settings/HMSSimulcastSettings$Builder;", "", "<init>", "()V", "low", "Llive/hms/video/media/settings/HMSSimulcastSettings$Item;", "medium", "high", "build", "Llive/hms/video/media/settings/HMSSimulcastSettings;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Builder {
        private Item high;
        private Item low;
        private Item medium;

        public final HMSSimulcastSettings build() {
            Item item = this.low;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (item == null && this.medium == null && this.high == null) {
                DefaultVideoSettings defaultVideoSettings = DefaultVideoSettings.INSTANCE;
                return new HMSSimulcastSettings(new Item(defaultVideoSettings.getQVGA().getMaxBitRate(), defaultVideoSettings.getQVGA().getMaxFrameRate()), new Item(defaultVideoSettings.getVGA().getMaxBitRate(), defaultVideoSettings.getVGA().getMaxFrameRate()), new Item(defaultVideoSettings.getSHD().getMaxBitRate(), defaultVideoSettings.getSHD().getMaxFrameRate()), defaultConstructorMarker);
            }
            if (item == null || this.medium == null || this.high == null) {
                throw new IllegalStateException("Expected all low, medium and high settings to be defined");
            }
            AbstractC22676k.m65747g(item);
            Item item2 = this.medium;
            AbstractC22676k.m65747g(item2);
            Item item3 = this.high;
            AbstractC22676k.m65747g(item3);
            return new HMSSimulcastSettings(item, item2, item3, defaultConstructorMarker);
        }

        public final Builder high(Item high) {
            AbstractC22676k.m65750j(high, "high");
            this.high = high;
            return this;
        }

        public final Builder low(Item low) {
            AbstractC22676k.m65750j(low, "low");
            this.low = low;
            return this;
        }

        public final Builder medium(Item medium) {
            AbstractC22676k.m65750j(medium, "medium");
            this.medium = medium;
            return this;
        }
    }

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/media/settings/HMSSimulcastSettings$Item;", "", "bitrate", "", "frameRate", "<init>", "(II)V", "getBitrate", "()I", "getFrameRate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Item {
        private final int bitrate;
        private final int frameRate;

        public Item(int i13, int i14) {
            this.bitrate = i13;
            this.frameRate = i14;
        }

        public static /* synthetic */ Item copy$default(Item item, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i13 = item.bitrate;
            }
            if ((i15 & 2) != 0) {
                i14 = item.frameRate;
            }
            return item.copy(i13, i14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getBitrate() {
            return this.bitrate;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getFrameRate() {
            return this.frameRate;
        }

        public final Item copy(int bitrate, int frameRate) {
            return new Item(bitrate, frameRate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return this.bitrate == item.bitrate && this.frameRate == item.frameRate;
        }

        public final int getBitrate() {
            return this.bitrate;
        }

        public final int getFrameRate() {
            return this.frameRate;
        }

        public int hashCode() {
            return Integer.hashCode(this.frameRate) + (Integer.hashCode(this.bitrate) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("Item(bitrate=");
            sb4.append(this.bitrate);
            sb4.append(", frameRate=");
            return AbstractC11895b.m31999r(sb4, this.frameRate, ')');
        }
    }

    public /* synthetic */ HMSSimulcastSettings(Item item, Item item2, Item item3, DefaultConstructorMarker defaultConstructorMarker) {
        this(item, item2, item3);
    }

    public final Item getHigh() {
        return this.high;
    }

    public final Item getLow() {
        return this.low;
    }

    public final Item getMedium() {
        return this.medium;
    }

    private HMSSimulcastSettings(Item item, Item item2, Item item3) {
        this.low = item;
        this.medium = item2;
        this.high = item3;
    }
}
