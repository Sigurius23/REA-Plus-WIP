package com.mapbox.maps.attribution;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000  2\u00020\u0001:\n\u001e\u001f !\"#$%&'B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u001b\u001a\u00020\u0007J\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000e¨\u0006("}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure;", "", "snapshot", "Landroid/graphics/Bitmap;", "logo", "logoSmall", "textView", "Landroid/widget/TextView;", "textViewShort", "margin", "", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/widget/TextView;Landroid/widget/TextView;F)V", "logoContainerWidth", "getLogoContainerWidth", "()F", "logoSmallContainerWidth", "getLogoSmallContainerWidth", "maxSize", "getMaxSize", "maxSizeShort", "getMaxSizeShort", "shorterText", "", "textViewContainerWidth", "getTextViewContainerWidth", "textViewShortContainerWidth", "getTextViewShortContainerWidth", "getTextView", "measure", "Lcom/mapbox/maps/attribution/AttributionLayout;", "Chain", "Command", "Companion", "FullLogoLongTextCommand", "FullLogoShortTextCommand", "LongTextCommand", "NoTextCommand", "ShortTextCommand", "SmallLogoLongTextCommand", "SmallLogoShortTextCommand", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class AttributionMeasure {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Bitmap logo;
    private final Bitmap logoSmall;
    private final float margin;
    private boolean shorterText;
    private final Bitmap snapshot;
    private final TextView textView;
    private final TextView textViewShort;

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$Chain;", "", "commands", "", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "(Lcom/mapbox/maps/attribution/AttributionMeasure;[Lcom/mapbox/maps/attribution/AttributionMeasure$Command;)V", "", "getCommands", "()Ljava/util/List;", "setCommands", "(Ljava/util/List;)V", "start", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public final class Chain {
        private List<? extends Command> commands;
        final /* synthetic */ AttributionMeasure this$0;

        public Chain(AttributionMeasure attributionMeasure, Command... commands) {
            AbstractC22676k.m65750j(commands, "commands");
            this.this$0 = attributionMeasure;
            this.commands = AbstractC37056f.m118959K(Arrays.copyOf(commands, commands.length));
        }

        public final List<Command> getCommands() {
            return this.commands;
        }

        public final void setCommands(List<? extends Command> list) {
            AbstractC22676k.m65750j(list, "<set-?>");
            this.commands = list;
        }

        public final AttributionLayout start(AttributionMeasure measure) {
            AbstractC22676k.m65750j(measure, "measure");
            Iterator<? extends Command> it = this.commands.iterator();
            AttributionLayout attributionLayoutExecute = null;
            while (it.hasNext() && (attributionLayoutExecute = it.next().execute(measure)) == null) {
            }
            return attributionLayoutExecute;
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J6\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "width", "", "maxSize", "logo", "Landroid/graphics/Bitmap;", "isShortText", "", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public interface Command {

        @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
        public static final class DefaultImpls {
            public static AttributionLayout execute(Command command, AttributionMeasure measure, float f13, float f14, Bitmap bitmap, boolean z4) {
                AbstractC22676k.m65750j(measure, "measure");
                if (f13 <= f14) {
                    return new AttributionLayout(bitmap, AttributionMeasure.INSTANCE.calculateAnchor(measure.snapshot, measure.textView, measure.margin), z4);
                }
                return null;
            }

            public static /* synthetic */ AttributionLayout execute$default(Command command, AttributionMeasure attributionMeasure, float f13, float f14, Bitmap bitmap, boolean z4, int i13, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
                }
                if ((i13 & 16) != 0) {
                    z4 = false;
                }
                return command.execute(attributionMeasure, f13, f14, bitmap, z4);
            }
        }

        AttributionLayout execute(AttributionMeasure measure);

        AttributionLayout execute(AttributionMeasure measure, float width, float maxSize, Bitmap logo, boolean isShortText);
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$Companion;", "", "()V", "calculateAnchor", "Landroid/graphics/PointF;", "snapshot", "Landroid/graphics/Bitmap;", "textView", "Landroid/widget/TextView;", "margin", "", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PointF calculateAnchor(Bitmap snapshot, TextView textView, float margin) {
            return new PointF((snapshot.getWidth() - textView.getMeasuredWidth()) - margin, (snapshot.getHeight() - textView.getMeasuredHeight()) - margin);
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$FullLogoLongTextCommand;", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "()V", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class FullLogoLongTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure, float f13, float f14, Bitmap bitmap, boolean z4) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f13, f14, bitmap, z4);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure measure) {
            AbstractC22676k.m65750j(measure, "measure");
            return Command.DefaultImpls.execute$default(this, measure, measure.getTextViewContainerWidth() + measure.getLogoContainerWidth(), measure.getMaxSize(), measure.logo, false, 16, null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$FullLogoShortTextCommand;", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "()V", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class FullLogoShortTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure, float f13, float f14, Bitmap bitmap, boolean z4) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f13, f14, bitmap, z4);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure measure) {
            AbstractC22676k.m65750j(measure, "measure");
            return execute(measure, measure.getTextViewShortContainerWidth() + measure.getLogoContainerWidth(), measure.getMaxSizeShort(), measure.logo, true);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$LongTextCommand;", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "()V", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class LongTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure, float f13, float f14, Bitmap bitmap, boolean z4) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f13, f14, bitmap, z4);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure measure) {
            AbstractC22676k.m65750j(measure, "measure");
            return Command.DefaultImpls.execute$default(this, measure, measure.margin + measure.getTextViewContainerWidth(), measure.getMaxSize(), null, false, 16, null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$NoTextCommand;", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "()V", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class NoTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure, float f13, float f14, Bitmap bitmap, boolean z4) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f13, f14, bitmap, z4);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure measure) {
            AbstractC22676k.m65750j(measure, "measure");
            return new AttributionLayout(null, null, false);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$ShortTextCommand;", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "()V", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class ShortTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure, float f13, float f14, Bitmap bitmap, boolean z4) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f13, f14, bitmap, z4);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure measure) {
            AbstractC22676k.m65750j(measure, "measure");
            return execute(measure, measure.margin + measure.getTextViewShortContainerWidth(), measure.getMaxSizeShort(), null, true);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$SmallLogoLongTextCommand;", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "()V", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class SmallLogoLongTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure, float f13, float f14, Bitmap bitmap, boolean z4) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f13, f14, bitmap, z4);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure measure) {
            AbstractC22676k.m65750j(measure, "measure");
            return Command.DefaultImpls.execute$default(this, measure, measure.getTextViewContainerWidth() + measure.getLogoSmallContainerWidth(), measure.getMaxSize(), measure.logoSmall, false, 16, null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/maps/attribution/AttributionMeasure$SmallLogoShortTextCommand;", "Lcom/mapbox/maps/attribution/AttributionMeasure$Command;", "()V", "execute", "Lcom/mapbox/maps/attribution/AttributionLayout;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class SmallLogoShortTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure, float f13, float f14, Bitmap bitmap, boolean z4) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f13, f14, bitmap, z4);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure measure) {
            AbstractC22676k.m65750j(measure, "measure");
            return execute(measure, measure.getTextViewShortContainerWidth() + measure.getLogoContainerWidth(), measure.getMaxSizeShort(), measure.logoSmall, true);
        }
    }

    public AttributionMeasure(Bitmap snapshot, Bitmap logo, Bitmap logoSmall, TextView textView, TextView textViewShort, float f13) {
        AbstractC22676k.m65750j(snapshot, "snapshot");
        AbstractC22676k.m65750j(logo, "logo");
        AbstractC22676k.m65750j(logoSmall, "logoSmall");
        AbstractC22676k.m65750j(textView, "textView");
        AbstractC22676k.m65750j(textViewShort, "textViewShort");
        this.snapshot = snapshot;
        this.logo = logo;
        this.logoSmall = logoSmall;
        this.textView = textView;
        this.textViewShort = textViewShort;
        this.margin = f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getLogoContainerWidth() {
        return (2 * this.margin) + this.logo.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getLogoSmallContainerWidth() {
        return (2 * this.margin) + this.logoSmall.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getMaxSize() {
        return (this.snapshot.getWidth() * 8) / 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getMaxSizeShort() {
        return this.snapshot.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getTextViewContainerWidth() {
        return this.textView.getMeasuredWidth() + this.margin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getTextViewShortContainerWidth() {
        return this.textViewShort.getMeasuredWidth() + this.margin;
    }

    public final TextView getTextView() {
        return this.shorterText ? this.textViewShort : this.textView;
    }

    public final AttributionLayout measure() {
        AttributionLayout attributionLayoutStart = new Chain(this, new FullLogoLongTextCommand(), new FullLogoShortTextCommand(), new SmallLogoLongTextCommand(), new SmallLogoShortTextCommand(), new LongTextCommand(), new ShortTextCommand(), new NoTextCommand()).start(this);
        if (attributionLayoutStart != null) {
            this.shorterText = attributionLayoutStart.isShortText();
        }
        return attributionLayoutStart;
    }
}
