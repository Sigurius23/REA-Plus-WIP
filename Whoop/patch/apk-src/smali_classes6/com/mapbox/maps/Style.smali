.class public final Lcom/mapbox/maps/Style;
.super Lcom/mapbox/maps/MapboxStyleManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/Style$Companion;,
        Lcom/mapbox/maps/Style$OnStyleLoaded;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00fa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0018\u0000 \u00d1\u00012\u00020\u0001:\u0004\u00d1\u0001\u00d2\u0001B!\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J3\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0017\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001dH\u0017\u00a2\u0006\u0004\u0008!\u0010\"J\u0015\u0010%\u001a\u0008\u0012\u0004\u0012\u00020$0#H\u0017\u00a2\u0006\u0004\u0008%\u0010&J#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\'\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008(\u0010)J#\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010\'\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008*\u0010)J?\u0010-\u001a*\u0012\u0004\u0012\u00020\u0011\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140+j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014`,0\u00192\u0006\u0010\'\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008-\u0010)J+\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00192\u0006\u0010\'\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008/\u00100JG\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\'\u001a\u00020\u00112\"\u00101\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170+j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017`,H\u0017\u00a2\u0006\u0004\u00082\u00103J3\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\'\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017\u00a2\u0006\u0004\u00084\u0010\u001cJ]\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\'\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00112&\u0010.\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u00010+j\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u0001`,2\u0008\u00107\u001a\u0004\u0018\u000106H\u0017\u00a2\u0006\u0004\u00088\u00109J]\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\'\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00112&\u0010.\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u00010+j\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u0001`,2\u0008\u00107\u001a\u0004\u0018\u000106H\u0017\u00a2\u0006\u0004\u0008;\u00109JS\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\'\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00112&\u0010.\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u00010+j\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u0001`,H\u0017\u00a2\u0006\u0004\u0008<\u0010=JS\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\'\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00112&\u0010.\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u00010+j\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u0001`,H\u0017\u00a2\u0006\u0004\u0008>\u0010=J-\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\'\u001a\u00020\u00112\u0008\u00107\u001a\u0004\u0018\u000106H\u0017\u00a2\u0006\u0004\u0008?\u0010@J-\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010A\u001a\u00020\u00172\u0008\u0010C\u001a\u0004\u0018\u00010BH\u0017\u00a2\u0006\u0004\u0008D\u0010EJ#\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010F\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008G\u0010)J-\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010F\u001a\u00020\u00112\u0008\u0010H\u001a\u0004\u0018\u00010BH\u0017\u00a2\u0006\u0004\u0008I\u0010JJ\u0017\u0010K\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008K\u0010LJ\u001f\u0010M\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008M\u0010\u0016J3\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010F\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017\u00a2\u0006\u0004\u0008N\u0010\u001cJ+\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u0017H\u0017\u00a2\u0006\u0004\u0008P\u0010QJ+\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010S\u001a\u00020RH\u0017\u00a2\u0006\u0004\u0008T\u0010UJ+\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010W\u001a\u00020VH\u0017\u00a2\u0006\u0004\u0008X\u0010YJ+\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010[\u001a\u00020ZH\u0017\u00a2\u0006\u0004\u0008\\\u0010]J#\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008^\u0010)J9\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010W\u001a\u00020V2\u000c\u0010a\u001a\u0008\u0012\u0004\u0012\u00020`0_H\u0017\u00a2\u0006\u0004\u0008b\u0010cJ\u0017\u0010d\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008d\u0010LJ3\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010e\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017\u00a2\u0006\u0004\u0008f\u0010\u001cJ\u0015\u0010g\u001a\u0008\u0012\u0004\u0012\u00020$0_H\u0017\u00a2\u0006\u0004\u0008g\u0010&J#\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010h\u001a\u00020\u0017H\u0017\u00a2\u0006\u0004\u0008i\u0010jJ#\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010O\u001a\u00020\u0017H\u0017\u00a2\u0006\u0004\u0008k\u0010jJ\u0017\u0010l\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008l\u0010mJ+\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017\u00a2\u0006\u0004\u0008n\u0010QJ#\u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010O\u001a\u00020\u0017H\u0017\u00a2\u0006\u0004\u0008o\u0010jJ\u0017\u0010p\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008p\u0010mJ+\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017\u00a2\u0006\u0004\u0008q\u0010QJ#\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010O\u001a\u00020\u0017H\u0017\u00a2\u0006\u0004\u0008r\u0010jJ\u0017\u0010s\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008s\u0010mJ+\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017\u00a2\u0006\u0004\u0008t\u0010QJ\u001f\u0010u\u001a\u00020\u00142\u0006\u0010e\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008u\u0010\u0016Ja\u0010~\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010v\u001a\u00020\u00112\u0006\u0010w\u001a\u00020\u00042\u0006\u0010[\u001a\u00020Z2\u0006\u0010x\u001a\u00020\u000e2\u000c\u0010z\u001a\u0008\u0012\u0004\u0012\u00020y0#2\u000c\u0010{\u001a\u0008\u0012\u0004\u0012\u00020y0#2\u0008\u0010}\u001a\u0004\u0018\u00010|H\u0017\u00a2\u0006\u0004\u0008~\u0010\u007fJ\u001c\u0010\u0080\u0001\u001a\u0004\u0018\u00010Z2\u0006\u0010v\u001a\u00020\u0011H\u0017\u00a2\u0006\u0006\u0008\u0080\u0001\u0010\u0081\u0001J%\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010v\u001a\u00020\u0011H\u0017\u00a2\u0006\u0005\u0008\u0082\u0001\u0010)J\u0019\u0010\u0083\u0001\u001a\u00020\u000e2\u0006\u0010v\u001a\u00020\u0011H\u0017\u00a2\u0006\u0005\u0008\u0083\u0001\u0010LJ/\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0007\u0010\u0084\u0001\u001a\u00020\u00112\u0007\u0010\u0085\u0001\u001a\u00020\u0011H\u0017\u00a2\u0006\u0005\u0008\u0086\u0001\u00100J&\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0007\u0010\u0084\u0001\u001a\u00020\u0011H\u0017\u00a2\u0006\u0005\u0008\u0087\u0001\u0010)J\u001a\u0010\u0088\u0001\u001a\u00020\u000e2\u0007\u0010\u0084\u0001\u001a\u00020\u0011H\u0017\u00a2\u0006\u0005\u0008\u0088\u0001\u0010LJ%\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010F\u001a\u00020\u0011H\u0017\u00a2\u0006\u0005\u0008\u0089\u0001\u0010)J-\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010F\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u0017H\u0017\u00a2\u0006\u0005\u0008\u008a\u0001\u0010QJ:\u0010\u008d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010F\u001a\u00020\u00112\u0008\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0008\u0010H\u001a\u0004\u0018\u00010BH\u0017\u00a2\u0006\u0006\u0008\u008d\u0001\u0010\u008e\u0001J/\u0010\u008f\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010O\u001a\u00020\u00172\u0008\u0010H\u001a\u0004\u0018\u00010BH\u0017\u00a2\u0006\u0005\u0008\u008f\u0001\u0010EJ:\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010F\u001a\u00020\u00112\u0008\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0008\u0010H\u001a\u0004\u0018\u00010BH\u0017\u00a2\u0006\u0006\u0008\u0090\u0001\u0010\u008e\u0001J%\u0010\u0091\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00192\u0006\u0010F\u001a\u00020\u0011H\u0017\u00a2\u0006\u0005\u0008\u0091\u0001\u0010)J0\u0010\u0094\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0017\u00a2\u0006\u0006\u0008\u0094\u0001\u0010\u0095\u0001J\u0012\u0010\u0096\u0001\u001a\u00020\u0011H\u0017\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0097\u0001J\u001b\u0010\u0099\u0001\u001a\u00020\n2\u0007\u0010\u0098\u0001\u001a\u00020\u0011H\u0017\u00a2\u0006\u0006\u0008\u0099\u0001\u0010\u009a\u0001J%\u0010\u009b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010\u0012\u001a\u00020\u0011H\u0017\u00a2\u0006\u0005\u0008\u009b\u0001\u0010)J-\u0010\u009c\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u0017H\u0017\u00a2\u0006\u0005\u0008\u009c\u0001\u0010QJ9\u0010\u00a0\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010\u009d\u0001\u001a\u00020\u00112\u0008\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0017\u00a2\u0006\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001J>\u0010\u00a3\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010\u009d\u0001\u001a\u00020\u00112\r\u0010\u00a2\u0001\u001a\u0008\u0012\u0004\u0012\u00020`0#H\u0017\u00a2\u0006\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001J>\u0010\u00a5\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010\u009d\u0001\u001a\u00020\u00112\r\u0010\u00a2\u0001\u001a\u0008\u0012\u0004\u0012\u00020`0#H\u0017\u00a2\u0006\u0006\u0008\u00a5\u0001\u0010\u00a4\u0001J>\u0010\u00a7\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010\u009d\u0001\u001a\u00020\u00112\r\u0010\u00a6\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00110#H\u0017\u00a2\u0006\u0006\u0008\u00a7\u0001\u0010\u00a4\u0001J\u0011\u0010\u00a8\u0001\u001a\u00020\u000eH\u0017\u00a2\u0006\u0005\u0008\u00a8\u0001\u0010\u0010J*\u0010\u00ab\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\n\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00a9\u0001H\u0017\u00a2\u0006\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001J(\u0010\u00ab\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0008\u0010\u00ae\u0001\u001a\u00030\u00ad\u0001H\u0017\u00a2\u0006\u0006\u0008\u00ab\u0001\u0010\u00af\u0001J&\u0010\u00ab\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0007\u0010\u00b0\u0001\u001a\u00020\u0011H\u0017\u00a2\u0006\u0005\u0008\u00ab\u0001\u0010)J&\u0010\u00ab\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010[\u001a\u00020ZH\u0017\u00a2\u0006\u0006\u0008\u00ab\u0001\u0010\u00b1\u0001J2\u0010\u00b2\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\'\u001a\u00020\u00112\n\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00a9\u0001H\u0017\u00a2\u0006\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001J0\u0010\u00b2\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\'\u001a\u00020\u00112\u0008\u0010\u00ae\u0001\u001a\u00030\u00ad\u0001H\u0017\u00a2\u0006\u0006\u0008\u00b2\u0001\u0010\u00b4\u0001J.\u0010\u00b2\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\'\u001a\u00020\u00112\u0007\u0010\u00b0\u0001\u001a\u00020\u0011H\u0017\u00a2\u0006\u0005\u0008\u00b2\u0001\u00100J-\u0010\u00b2\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\'\u001a\u00020\u00112\u0006\u0010[\u001a\u00020ZH\u0017\u00a2\u0006\u0005\u0008\u00b2\u0001\u0010]J0\u0010\u00b6\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0093\u0001\u001a\u00030\u00b5\u0001H\u0017\u00a2\u0006\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001J6\u0010\u00ba\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u00b9\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b8\u00010#H\u0017\u00a2\u0006\u0006\u0008\u00ba\u0001\u0010\u00bb\u0001J\u0018\u0010\u00bd\u0001\u001a\t\u0012\u0005\u0012\u00030\u00bc\u00010#H\u0017\u00a2\u0006\u0005\u0008\u00bd\u0001\u0010&J\u001b\u0010\u00bf\u0001\u001a\u00020\n2\u0007\u0010\u00be\u0001\u001a\u00020\u0011H\u0002\u00a2\u0006\u0006\u0008\u00bf\u0001\u0010\u009a\u0001R\u0019\u0010\u00c0\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c0\u0001\u0010\u00c1\u0001R\u0018\u0010\u00c5\u0001\u001a\u00030\u00c2\u00018WX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00c3\u0001\u0010\u00c4\u0001R\u0017\u0010\u00c7\u0001\u001a\u00020\u00118WX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00c6\u0001\u0010\u0097\u0001R\u0017\u0010\u00c9\u0001\u001a\u00020\u00118WX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00c8\u0001\u0010\u0097\u0001R\u001c\u0010\u00cb\u0001\u001a\u0008\u0012\u0004\u0012\u00020$0#8WX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ca\u0001\u0010&R#\u0010\u00ce\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00110#8WX\u0097\u0004\u00a2\u0006\u000e\u0012\u0005\u0008\u00cd\u0001\u0010\u000c\u001a\u0005\u0008\u00cc\u0001\u0010&R\u001c\u0010\u00d0\u0001\u001a\u0008\u0012\u0004\u0012\u00020$0#8WX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00cf\u0001\u0010&\u00a8\u0006\u00d3\u0001"
    }
    d2 = {
        "Lcom/mapbox/maps/Style;",
        "Lcom/mapbox/maps/MapboxStyleManager;",
        "Lcom/mapbox/maps/StyleManager;",
        "styleManager",
        "",
        "pixelRatio",
        "Lcom/mapbox/maps/MapLoadingErrorDelegate;",
        "mapLoadingErrorDelegate",
        "<init>",
        "(Lcom/mapbox/maps/StyleManager;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V",
        "Ll83/a0;",
        "markInvalid$maps_sdk_release",
        "()V",
        "markInvalid",
        "",
        "isValid",
        "()Z",
        "",
        "sourceId",
        "property",
        "Lcom/mapbox/maps/StylePropertyValue;",
        "getStyleSourceProperty",
        "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;",
        "Lcom/mapbox/bindgen/Value;",
        "value",
        "Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/bindgen/None;",
        "setStyleSourceProperty",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/TransitionOptions;",
        "getStyleTransition",
        "()Lcom/mapbox/maps/TransitionOptions;",
        "transitionOptions",
        "setStyleTransition",
        "(Lcom/mapbox/maps/TransitionOptions;)V",
        "",
        "Lcom/mapbox/maps/StyleObjectInfo;",
        "getStyleImports",
        "()Ljava/util/List;",
        "importId",
        "removeStyleImport",
        "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;",
        "getStyleImportSchema",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "getStyleImportConfigProperties",
        "config",
        "getStyleImportConfigProperty",
        "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;",
        "configs",
        "setStyleImportConfigProperties",
        "(Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;",
        "setStyleImportConfigProperty",
        "json",
        "Lcom/mapbox/maps/ImportPosition;",
        "importPosition",
        "addStyleImportFromJSON",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;",
        "uri",
        "addStyleImportFromURI",
        "updateStyleImportWithJSON",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;",
        "updateStyleImportWithURI",
        "moveStyleImport",
        "(Ljava/lang/String;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;",
        "parameters",
        "Lcom/mapbox/maps/LayerPosition;",
        "position",
        "addStyleLayer",
        "(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;",
        "layerId",
        "removeStyleLayer",
        "layerPosition",
        "moveStyleLayer",
        "(Ljava/lang/String;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;",
        "styleLayerExists",
        "(Ljava/lang/String;)Z",
        "getStyleLayerProperty",
        "setStyleLayerProperty",
        "properties",
        "addStyleSource",
        "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/CoordinateBounds;",
        "coordinateBounds",
        "invalidateStyleCustomGeometrySourceRegion",
        "(Ljava/lang/String;Lcom/mapbox/maps/CoordinateBounds;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/CanonicalTileID;",
        "tileId",
        "invalidateStyleCustomGeometrySourceTile",
        "(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/Image;",
        "image",
        "updateStyleImageSourceImage",
        "(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;",
        "removeStyleSource",
        "",
        "Lcom/mapbox/geojson/Feature;",
        "featureCollection",
        "setStyleCustomGeometrySourceTileData",
        "(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;",
        "styleSourceExists",
        "id",
        "setStyleLightProperty",
        "getStyleLights",
        "lights",
        "setStyleLights",
        "(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;",
        "setStyleAtmosphere",
        "getStyleAtmosphereProperty",
        "(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;",
        "setStyleAtmosphereProperty",
        "setStyleTerrain",
        "getStyleTerrainProperty",
        "setStyleTerrainProperty",
        "setStyleProjection",
        "getStyleProjectionProperty",
        "setStyleProjectionProperty",
        "getStyleLightProperty",
        "imageId",
        "scale",
        "sdf",
        "Lcom/mapbox/maps/ImageStretches;",
        "stretchX",
        "stretchY",
        "Lcom/mapbox/maps/ImageContent;",
        "content",
        "addStyleImage",
        "(Ljava/lang/String;FLcom/mapbox/maps/Image;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/bindgen/Expected;",
        "getStyleImage",
        "(Ljava/lang/String;)Lcom/mapbox/maps/Image;",
        "removeStyleImage",
        "hasStyleImage",
        "modelId",
        "modelUri",
        "addStyleModel",
        "removeStyleModel",
        "hasStyleModel",
        "getStyleLayerProperties",
        "setStyleLayerProperties",
        "Lcom/mapbox/maps/CustomLayerHost;",
        "layerHost",
        "addStyleCustomLayer",
        "(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;",
        "addPersistentStyleLayer",
        "addPersistentStyleCustomLayer",
        "isStyleLayerPersistent",
        "Lcom/mapbox/maps/CustomGeometrySourceOptions;",
        "options",
        "addStyleCustomGeometrySource",
        "(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)Lcom/mapbox/bindgen/Expected;",
        "getStyleGlyphURL",
        "()Ljava/lang/String;",
        "url",
        "setStyleGlyphURL",
        "(Ljava/lang/String;)V",
        "getStyleSourceProperties",
        "setStyleSourceProperties",
        "dataId",
        "Lcom/mapbox/maps/GeoJSONSourceData;",
        "data",
        "setStyleGeoJSONSourceData",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/GeoJSONSourceData;)Lcom/mapbox/bindgen/Expected;",
        "features",
        "addGeoJSONSourceFeatures",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;",
        "updateGeoJSONSourceFeatures",
        "featureIds",
        "removeGeoJSONSourceFeatures",
        "isStyleLoaded",
        "Lcom/mapbox/maps/ColorTheme;",
        "colorTheme",
        "setStyleColorTheme",
        "(Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "(Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;",
        "base64",
        "(Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;",
        "setImportColorTheme",
        "(Ljava/lang/String;Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;",
        "(Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/CustomRasterSourceOptions;",
        "addStyleCustomRasterSource",
        "(Ljava/lang/String;Lcom/mapbox/maps/CustomRasterSourceOptions;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/CustomRasterSourceTileData;",
        "tiles",
        "setStyleCustomRasterSourceTileData",
        "(Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/FeaturesetDescriptor;",
        "getFeaturesets",
        "methodName",
        "checkNativeStyle",
        "isStyleValid",
        "Z",
        "Lcom/mapbox/maps/CameraOptions;",
        "getStyleDefaultCamera",
        "()Lcom/mapbox/maps/CameraOptions;",
        "styleDefaultCamera",
        "getStyleURI",
        "styleURI",
        "getStyleJSON",
        "styleJSON",
        "getStyleSources",
        "styleSources",
        "getStyleSlots",
        "getStyleSlots$annotations",
        "styleSlots",
        "getStyleLayers",
        "styleLayers",
        "Companion",
        "OnStyleLoaded",
        "maps-sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/mapbox/maps/Style$Companion;

.field public static final DARK:Ljava/lang/String; = "mapbox://styles/mapbox/dark-v11"

.field public static final LIGHT:Ljava/lang/String; = "mapbox://styles/mapbox/light-v11"

.field public static final MAPBOX_STREETS:Ljava/lang/String; = "mapbox://styles/mapbox/streets-v12"

.field public static final OUTDOORS:Ljava/lang/String; = "mapbox://styles/mapbox/outdoors-v12"

.field public static final SATELLITE:Ljava/lang/String; = "mapbox://styles/mapbox/satellite-v9"

.field public static final SATELLITE_STREETS:Ljava/lang/String; = "mapbox://styles/mapbox/satellite-streets-v12"

.field public static final STANDARD:Ljava/lang/String; = "mapbox://styles/mapbox/standard"

.field public static final STANDARD_SATELLITE:Ljava/lang/String; = "mapbox://styles/mapbox/standard-satellite"

.field private static final TAG:Ljava/lang/String; = "Mbgl-Style"

.field public static final TRAFFIC_DAY:Ljava/lang/String; = "mapbox://styles/mapbox/traffic-day-v2"

.field public static final TRAFFIC_NIGHT:Ljava/lang/String; = "mapbox://styles/mapbox/traffic-night-v2"


# instance fields
.field private volatile isStyleValid:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/Style$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/Style$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/Style;->Companion:Lcom/mapbox/maps/Style$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/mapbox/maps/StyleManager;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V
    .locals 1

    const-string v0, "styleManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapLoadingErrorDelegate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;-><init>(Lcom/mapbox/maps/StyleManager;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/mapbox/maps/Style;->isStyleValid:Z

    return-void
.end method

.method private final checkNativeStyle(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lcom/mapbox/maps/Style;->isStyleValid:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Style object (accessing "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ") should not be stored and used after MapView is destroyed or new style has been loaded."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Mbgl-Style"

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static synthetic getStyleSlots$annotations()V
    .locals 0
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    return-void
.end method


# virtual methods
.method public addGeoJSONSourceFeatures(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/mapbox/geojson/Feature;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "features"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/mapbox/maps/Style;->isStyleValid:Z

    if-nez v0, :cond_0

    const-string v0, "Mbgl-Style"

    const-string v1, "Style object (accessing addGeoJSONSourceFeatures) should not be stored and used after MapView is destroyed or new style has been loaded."

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->addGeoJSONSourceFeatures(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public addPersistentStyleCustomLayer(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CustomLayerHost;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layerHost"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addPersistentStyleCustomLayer"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->addPersistentStyleCustomLayer(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public addPersistentStyleLayer(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addPersistentStyleLayer"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->addPersistentStyleLayer(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public addStyleCustomGeometrySource(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CustomGeometrySourceOptions;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addStyleCustomGeometrySource"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->addStyleCustomGeometrySource(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public addStyleCustomLayer(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CustomLayerHost;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layerHost"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addStyleCustomLayer"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->addStyleCustomLayer(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public addStyleCustomRasterSource(Ljava/lang/String;Lcom/mapbox/maps/CustomRasterSourceOptions;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CustomRasterSourceOptions;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addStyleCustomRasterSource"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->addStyleCustomRasterSource(Ljava/lang/String;Lcom/mapbox/maps/CustomRasterSourceOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public addStyleImage(Ljava/lang/String;FLcom/mapbox/maps/Image;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "F",
            "Lcom/mapbox/maps/Image;",
            "Z",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/ImageStretches;",
            ">;",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/ImageStretches;",
            ">;",
            "Lcom/mapbox/maps/ImageContent;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stretchX"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stretchY"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addStyleImage"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super/range {p0 .. p7}, Lcom/mapbox/maps/MapboxStyleManager;->addStyleImage(Ljava/lang/String;FLcom/mapbox/maps/Image;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public addStyleImportFromJSON(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;",
            "Lcom/mapbox/maps/ImportPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addStyleImportFromJSON"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3, p4}, Lcom/mapbox/maps/MapboxStyleManager;->addStyleImportFromJSON(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public addStyleImportFromURI(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;",
            "Lcom/mapbox/maps/ImportPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uri"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addStyleImportFromURI"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3, p4}, Lcom/mapbox/maps/MapboxStyleManager;->addStyleImportFromURI(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public addStyleLayer(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "parameters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addStyleLayer"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->addStyleLayer(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public addStyleModel(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "modelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelUri"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addStyleModel"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->addStyleModel(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public addStyleSource(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "properties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addStyleSource"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->addStyleSource(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public getFeaturesets()Ljava/util/List;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/FeaturesetDescriptor;",
            ">;"
        }
    .end annotation

    const-string v0, "getFeaturesets"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/mapbox/maps/MapboxStyleManager;->getFeaturesets()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStyleAtmosphereProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getStyleAtmosphereProperty"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleAtmosphereProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    return-object p1
.end method

.method public getStyleDefaultCamera()Lcom/mapbox/maps/CameraOptions;
    .locals 1

    const-string v0, "getStyleDefaultCamera"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleDefaultCamera()Lcom/mapbox/maps/CameraOptions;

    move-result-object v0

    return-object v0
.end method

.method public getStyleGlyphURL()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "getStyleGlyphURL"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleGlyphURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getStyleImage(Ljava/lang/String;)Lcom/mapbox/maps/Image;
    .locals 1

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getStyleImage"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleImage(Ljava/lang/String;)Lcom/mapbox/maps/Image;

    move-result-object p1

    return-object p1
.end method

.method public getStyleImportConfigProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/StylePropertyValue;",
            ">;>;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getStyleImportConfigProperties"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleImportConfigProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public getStyleImportConfigProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/StylePropertyValue;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getStyleImportConfigProperty"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleImportConfigProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public getStyleImportSchema(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getStyleImportSchema"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleImportSchema(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public getStyleImports()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/StyleObjectInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "getStyleImports"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleImports()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStyleJSON()Ljava/lang/String;
    .locals 1

    const-string v0, "getStyleJSON"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleJSON()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getStyleLayerProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getStyleLayerProperties"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleLayerProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public getStyleLayerProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getStyleLayerProperty"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleLayerProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    return-object p1
.end method

.method public getStyleLayers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/StyleObjectInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "getStyleLayers"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleLayers()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStyleLightProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getStyleLightProperty"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleLightProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    return-object p1
.end method

.method public getStyleLights()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/StyleObjectInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "getStyleLights"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleLights()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStyleProjectionProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getStyleProjectionProperty"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleProjectionProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    return-object p1
.end method

.method public getStyleSlots()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "getStyleSlots"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleSlots()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStyleSourceProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getStyleSourceProperties"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleSourceProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public getStyleSourceProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getStyleSourceProperty"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleSourceProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    return-object p1
.end method

.method public getStyleSources()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/StyleObjectInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "getStyleSources"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleSources()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStyleTerrainProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getStyleTerrainProperty"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleTerrainProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    return-object p1
.end method

.method public getStyleTransition()Lcom/mapbox/maps/TransitionOptions;
    .locals 1

    const-string v0, "getStyleTransition"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleTransition()Lcom/mapbox/maps/TransitionOptions;

    move-result-object v0

    return-object v0
.end method

.method public getStyleURI()Ljava/lang/String;
    .locals 1

    const-string v0, "getStyleURI"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleURI()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hasStyleImage(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hasStyleImage"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->hasStyleImage(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public hasStyleModel(Ljava/lang/String;)Z
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "modelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hasStyleModel"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->hasStyleModel(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public invalidateStyleCustomGeometrySourceRegion(Ljava/lang/String;Lcom/mapbox/maps/CoordinateBounds;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CoordinateBounds;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coordinateBounds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "invalidateStyleCustomGeometrySourceRegion"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->invalidateStyleCustomGeometrySourceRegion(Ljava/lang/String;Lcom/mapbox/maps/CoordinateBounds;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public invalidateStyleCustomGeometrySourceTile(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CanonicalTileID;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tileId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "invalidateStyleCustomGeometrySourceTile"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->invalidateStyleCustomGeometrySourceTile(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public isStyleLayerPersistent(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isStyleLayerPersistent"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->isStyleLayerPersistent(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public isStyleLoaded()Z
    .locals 1

    const-string v0, "isStyleLoaded"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/mapbox/maps/MapboxStyleManager;->isStyleLoaded()Z

    move-result v0

    return v0
.end method

.method public final isValid()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mapbox/maps/Style;->isStyleValid:Z

    return v0
.end method

.method public final markInvalid$maps_sdk_release()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mapbox/maps/Style;->isStyleValid:Z

    return-void
.end method

.method public moveStyleImport(Ljava/lang/String;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/ImportPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moveStyleImport"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->moveStyleImport(Ljava/lang/String;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public moveStyleLayer(Ljava/lang/String;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moveStyleLayer"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->moveStyleLayer(Ljava/lang/String;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public removeGeoJSONSourceFeatures(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/mapbox/maps/Style;->isStyleValid:Z

    if-nez v0, :cond_0

    const-string v0, "Mbgl-Style"

    const-string v1, "Style object (accessing removeGeoJSONSourceFeatures) should not be stored and used after MapView is destroyed or new style has been loaded."

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->removeGeoJSONSourceFeatures(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public removeStyleImage(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeStyleImage"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->removeStyleImage(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public removeStyleImport(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeStyleImport"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->removeStyleImport(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public removeStyleLayer(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeStyleLayer"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->removeStyleLayer(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public removeStyleModel(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "modelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeStyleModel"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->removeStyleModel(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public removeStyleSource(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeStyleSource"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->removeStyleSource(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setImportColorTheme(Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    const-string v0, "setImportColorTheme"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    .line 4
    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setImportColorTheme(Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setImportColorTheme(Ljava/lang/String;Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/ColorTheme;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    const-string v0, "setImportColorTheme"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setImportColorTheme(Ljava/lang/String;Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setImportColorTheme(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/Image;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    const-string v0, "setImportColorTheme"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    .line 8
    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setImportColorTheme(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setImportColorTheme(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "base64"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    const-string v0, "setImportColorTheme"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    .line 6
    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setImportColorTheme(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleAtmosphere(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleAtmosphere"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleAtmosphere(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleAtmosphereProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleAtmosphereProperty"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleAtmosphereProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleColorTheme(Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    const-string v0, "setStyleColorTheme"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    .line 4
    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleColorTheme(Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleColorTheme(Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ColorTheme;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "setStyleColorTheme"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleColorTheme(Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleColorTheme(Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/Image;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    const-string v0, "setStyleColorTheme"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    .line 8
    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleColorTheme(Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleColorTheme(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "base64"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    const-string v0, "setStyleColorTheme"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    .line 6
    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleColorTheme(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleCustomGeometrySourceTileData(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CanonicalTileID;",
            "Ljava/util/List<",
            "Lcom/mapbox/geojson/Feature;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tileId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureCollection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleCustomGeometrySourceTileData"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleCustomGeometrySourceTileData(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleCustomRasterSourceTileData(Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/CustomRasterSourceTileData;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tiles"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleCustomRasterSourceTileData"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleCustomRasterSourceTileData(Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleGeoJSONSourceData(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/GeoJSONSourceData;)Lcom/mapbox/bindgen/Expected;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/GeoJSONSourceData;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/mapbox/maps/Style;->isStyleValid:Z

    if-nez v0, :cond_0

    const-string v0, "Mbgl-Style"

    const-string v1, "Style object (accessing setStyleGeoJSONSourceData) should not be stored and used after MapView is destroyed or new style has been loaded."

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleGeoJSONSourceData(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/GeoJSONSourceData;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleGlyphURL(Ljava/lang/String;)V
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleGlyphURL"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleGlyphURL(Ljava/lang/String;)V

    return-void
.end method

.method public setStyleImportConfigProperties(Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleImportConfigProperties"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleImportConfigProperties(Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleImportConfigProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleImportConfigProperty"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleImportConfigProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleLayerProperties(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "properties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleLayerProperties"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleLayerProperties(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleLayerProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleLayerProperty"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleLayerProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleLightProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleLightProperty"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleLightProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleLights(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "lights"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleLights"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleLights(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleProjection(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleProjection"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleProjection(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleProjectionProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleProjectionProperty"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleProjectionProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleSourceProperties(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "properties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleSourceProperties"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleSourceProperties(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleSourceProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleSourceProperty"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleSourceProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleTerrain(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleTerrain"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleTerrain(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleTerrainProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleTerrainProperty"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleTerrainProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleTransition(Lcom/mapbox/maps/TransitionOptions;)V
    .locals 1

    const-string v0, "transitionOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setStyleTransition"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleTransition(Lcom/mapbox/maps/TransitionOptions;)V

    return-void
.end method

.method public styleLayerExists(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "styleLayerExists"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->styleLayerExists(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public styleSourceExists(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "styleSourceExists"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->styleSourceExists(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public updateGeoJSONSourceFeatures(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/mapbox/geojson/Feature;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "features"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/mapbox/maps/Style;->isStyleValid:Z

    if-nez v0, :cond_0

    const-string v0, "Mbgl-Style"

    const-string v1, "Style object (accessing updateGeoJSONSourceFeatures) should not be stored and used after MapView is destroyed or new style has been loaded."

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->updateGeoJSONSourceFeatures(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public updateStyleImageSourceImage(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/Image;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateStyleImageSourceImage"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->updateStyleImageSourceImage(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public updateStyleImportWithJSON(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateStyleImportWithJSON"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->updateStyleImportWithJSON(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public updateStyleImportWithURI(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uri"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateStyleImportWithURI"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/Style;->checkNativeStyle(Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->updateStyleImportWithURI(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method
