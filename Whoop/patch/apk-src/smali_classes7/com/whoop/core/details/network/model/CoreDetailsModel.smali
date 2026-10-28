.class public final Lcom/whoop/core/details/network/model/CoreDetailsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;,
        Lcom/whoop/core/details/network/model/CoreDetailsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008=\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008>\u0008\u0087\u0008\u0018\u0000 \u00b9\u00012\u00020\u0001:\u0004\u00ba\u0001\u00b9\u0001B\u00d3\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0008\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010&\u0012\u0008\u0010)\u001a\u0004\u0018\u00010(\u0012\u0008\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020+0\u0006\u0012\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0006\u0012\u0008\u00100\u001a\u0004\u0018\u00010/\u0012\u000e\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0006\u0012\u0008\u00104\u001a\u0004\u0018\u000103\u0012\n\u0008\u0002\u00105\u001a\u0004\u0018\u00010\u001b\u0012\u0010\u0008\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0006\u00a2\u0006\u0004\u00087\u00108B\u00eb\u0002\u0008\u0010\u0012\u0006\u0010:\u001a\u000209\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u0012\u0008\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0008\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010&\u0012\u0008\u0010)\u001a\u0004\u0018\u00010(\u0012\u0008\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0006\u0012\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0006\u0012\u0008\u00100\u001a\u0004\u0018\u00010/\u0012\u000e\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0006\u0012\u0008\u00104\u001a\u0004\u0018\u000103\u0012\u0008\u00105\u001a\u0004\u0018\u00010\u001b\u0012\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0006\u0012\u0008\u0010<\u001a\u0004\u0018\u00010;\u00a2\u0006\u0004\u00087\u0010=J\u0010\u0010>\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010AJ\u0018\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008B\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008F\u0010GJ\u0010\u0010H\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008H\u0010IJ\u0016\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008J\u0010CJ\u0010\u0010K\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008K\u0010LJ\u0010\u0010M\u001a\u00020\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008M\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008O\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u0008Q\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u0008S\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008U\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003\u00a2\u0006\u0004\u0008W\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003\u00a2\u0006\u0004\u0008Y\u0010XJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0004\u0008Z\u0010[J\u0012\u0010\\\u001a\u0004\u0018\u00010 H\u00c6\u0003\u00a2\u0006\u0004\u0008\\\u0010]J\u0010\u0010^\u001a\u00020\"H\u00c6\u0003\u00a2\u0006\u0004\u0008^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008`\u0010PJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008a\u0010PJ\u0012\u0010b\u001a\u0004\u0018\u00010&H\u00c6\u0003\u00a2\u0006\u0004\u0008b\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010(H\u00c6\u0003\u00a2\u0006\u0004\u0008d\u0010eJ\u0012\u0010f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008f\u0010GJ\u0016\u0010g\u001a\u0008\u0012\u0004\u0012\u00020+0\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008g\u0010CJ\u0018\u0010h\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008h\u0010CJ\u0012\u0010i\u001a\u0004\u0018\u00010/H\u00c6\u0003\u00a2\u0006\u0004\u0008i\u0010jJ\u0018\u0010k\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008k\u0010CJ\u0012\u0010l\u001a\u0004\u0018\u000103H\u00c6\u0003\u00a2\u0006\u0004\u0008l\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003\u00a2\u0006\u0004\u0008n\u0010XJ\u0018\u0010o\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008o\u0010CJ\u008e\u0003\u0010p\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00062\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00122\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0008\u0008\u0002\u0010#\u001a\u00020\"2\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010&2\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\u000e\u0008\u0002\u0010,\u001a\u0008\u0012\u0004\u0012\u00020+0\u00062\u0010\u0008\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u00062\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010/2\u0010\u0008\u0002\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00062\n\u0008\u0002\u00104\u001a\u0004\u0018\u0001032\n\u0008\u0002\u00105\u001a\u0004\u0018\u00010\u001b2\u0010\u0008\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008p\u0010qJ\u0010\u0010r\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008r\u0010PJ\u0010\u0010s\u001a\u000209H\u00d6\u0001\u00a2\u0006\u0004\u0008s\u0010tJ\u001a\u0010v\u001a\u00020\u000b2\u0008\u0010u\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008v\u0010wJ(\u0010\u0080\u0001\u001a\u00020}2\u0006\u0010x\u001a\u00020\u00002\u0006\u0010z\u001a\u00020y2\u0006\u0010|\u001a\u00020{H\u0001\u00a2\u0006\u0004\u0008~\u0010\u007fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0003\u0010\u0081\u0001\u001a\u0005\u0008\u0082\u0001\u0010?R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0005\u0010\u0083\u0001\u001a\u0005\u0008\u0084\u0001\u0010AR!\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0008\u0010\u0085\u0001\u001a\u0005\u0008\u0086\u0001\u0010CR&\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008\n\u0010\u0087\u0001\u0012\u0006\u0008\u0089\u0001\u0010\u008a\u0001\u001a\u0005\u0008\u0088\u0001\u0010ER\u001b\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000e\n\u0005\u0008\u000c\u0010\u008b\u0001\u001a\u0005\u0008\u008c\u0001\u0010GR\u0019\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000e\n\u0005\u0008\u000e\u0010\u008d\u0001\u001a\u0005\u0008\u008e\u0001\u0010IR\u001f\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00068\u0006\u00a2\u0006\u000e\n\u0005\u0008\u000f\u0010\u0085\u0001\u001a\u0005\u0008\u008f\u0001\u0010CR\u0019\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0011\u0010\u0090\u0001\u001a\u0005\u0008\u0091\u0001\u0010LR\u0019\u0010\u0013\u001a\u00020\u00128\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0013\u0010\u0092\u0001\u001a\u0005\u0008\u0093\u0001\u0010NR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0014\u0010\u0094\u0001\u001a\u0005\u0008\u0095\u0001\u0010PR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0016\u0010\u0096\u0001\u001a\u0005\u0008\u0097\u0001\u0010RR&\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008\u0018\u0010\u0098\u0001\u0012\u0006\u0008\u009a\u0001\u0010\u008a\u0001\u001a\u0005\u0008\u0099\u0001\u0010TR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006\u00a2\u0006\u000e\n\u0005\u0008\u001a\u0010\u009b\u0001\u001a\u0005\u0008\u009c\u0001\u0010VR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006\u00a2\u0006\u000e\n\u0005\u0008\u001c\u0010\u009d\u0001\u001a\u0005\u0008\u009e\u0001\u0010XR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0006\u00a2\u0006\u000e\n\u0005\u0008\u001d\u0010\u009d\u0001\u001a\u0005\u0008\u009f\u0001\u0010XR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006\u00a2\u0006\u000e\n\u0005\u0008\u001f\u0010\u00a0\u0001\u001a\u0005\u0008\u00a1\u0001\u0010[R\u001b\u0010!\u001a\u0004\u0018\u00010 8\u0006\u00a2\u0006\u000e\n\u0005\u0008!\u0010\u00a2\u0001\u001a\u0005\u0008\u00a3\u0001\u0010]R\u0019\u0010#\u001a\u00020\"8\u0006\u00a2\u0006\u000e\n\u0005\u0008#\u0010\u00a4\u0001\u001a\u0005\u0008\u00a5\u0001\u0010_R\u001b\u0010$\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000e\n\u0005\u0008$\u0010\u0094\u0001\u001a\u0005\u0008\u00a6\u0001\u0010PR\u001b\u0010%\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000e\n\u0005\u0008%\u0010\u0094\u0001\u001a\u0005\u0008\u00a7\u0001\u0010PR\u001b\u0010\'\u001a\u0004\u0018\u00010&8\u0006\u00a2\u0006\u000e\n\u0005\u0008\'\u0010\u00a8\u0001\u001a\u0005\u0008\u00a9\u0001\u0010cR\u001b\u0010)\u001a\u0004\u0018\u00010(8\u0006\u00a2\u0006\u000e\n\u0005\u0008)\u0010\u00aa\u0001\u001a\u0005\u0008\u00ab\u0001\u0010eR\u001b\u0010*\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000e\n\u0005\u0008*\u0010\u008b\u0001\u001a\u0005\u0008\u00ac\u0001\u0010GR*\u0010,\u001a\u0008\u0012\u0004\u0012\u00020+0\u00068\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008,\u0010\u0085\u0001\u0012\u0006\u0008\u00ae\u0001\u0010\u008a\u0001\u001a\u0005\u0008\u00ad\u0001\u0010CR!\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u00068\u0006\u00a2\u0006\u000e\n\u0005\u0008.\u0010\u0085\u0001\u001a\u0005\u0008\u00af\u0001\u0010CR\u001b\u00100\u001a\u0004\u0018\u00010/8\u0006\u00a2\u0006\u000e\n\u0005\u00080\u0010\u00b0\u0001\u001a\u0005\u0008\u00b1\u0001\u0010jR!\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00068\u0006\u00a2\u0006\u000e\n\u0005\u00082\u0010\u0085\u0001\u001a\u0005\u0008\u00b2\u0001\u0010CR\u001b\u00104\u001a\u0004\u0018\u0001038\u0006\u00a2\u0006\u000e\n\u0005\u00084\u0010\u00b3\u0001\u001a\u0005\u0008\u00b4\u0001\u0010mR&\u00105\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u00085\u0010\u009d\u0001\u0012\u0006\u0008\u00b6\u0001\u0010\u008a\u0001\u001a\u0005\u0008\u00b5\u0001\u0010XR,\u00106\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u00086\u0010\u0085\u0001\u0012\u0006\u0008\u00b8\u0001\u0010\u008a\u0001\u001a\u0005\u0008\u00b7\u0001\u0010C\u00a8\u0006\u00bb\u0001"
    }
    d2 = {
        "Lcom/whoop/core/details/network/model/CoreDetailsModel;",
        "",
        "Lcom/whoop/core/details/network/model/TitleBarModel;",
        "titleBar",
        "Lcom/whoop/design/models/items/CtaTileModel;",
        "linkWorkoutCtaTile",
        "",
        "",
        "onboardingOverlays",
        "Lcom/whoop/design/models/items/StrainBreakDownModel;",
        "strainBreakdownModel",
        "",
        "linkWorkoutOptionEnabled",
        "Lcom/whoop/design/models/items/HorizontalStatModel;",
        "horizontalStat",
        "horizontalStats",
        "Lcom/whoop/design/models/items/KeyMetricCarouselModel;",
        "keyMetricCarousel",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "graphResponse",
        "vowResponseString",
        "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "whoopCoachVow",
        "Lcom/whoop/design/models/items/BarGraphContainerModel;",
        "heartRateZoneContainer",
        "Lcom/whoop/design/models/items/AchievementProgressCardModel;",
        "achievementProgressCard",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "integrationPromoCard",
        "momentEntryPointTile",
        "Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
        "additionalInfoText",
        "Lcom/whoop/design/models/items/MapModel;",
        "map",
        "Lcom/whoop/core/details/network/model/DetailsEditComponent;",
        "detailsEditComponents",
        "graphId",
        "initialGraphId",
        "Lcom/whoop/core/details/network/model/GraphTitleBar;",
        "graphTitleBar",
        "Lcom/whoop/core/details/network/model/SupplementalData;",
        "supplementalData",
        "editable",
        "Lcom/whoop/core/details/network/model/TagModel;",
        "tags",
        "Lcom/whoop/design/models/items/TagModel;",
        "tagsV2",
        "Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;",
        "weightliftingCardioDetails",
        "Lcom/whoop/core/details/network/model/MenuOptionsItem;",
        "menuOptions",
        "Lcom/whoop/core/details/network/model/MetaData;",
        "metadata",
        "activityTargetsMiniArch",
        "designItems",
        "<init>",
        "(Lcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/core/details/network/model/TitleBarModel;",
        "component2",
        "()Lcom/whoop/design/models/items/CtaTileModel;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lcom/whoop/design/models/items/StrainBreakDownModel;",
        "component5",
        "()Ljava/lang/Boolean;",
        "component6",
        "()Lcom/whoop/design/models/items/HorizontalStatModel;",
        "component7",
        "component8",
        "()Lcom/whoop/design/models/items/KeyMetricCarouselModel;",
        "component9",
        "()Lcom/whoop/design/models/items/graph/GraphModel;",
        "component10",
        "()Ljava/lang/String;",
        "component11",
        "()Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "component12",
        "()Lcom/whoop/design/models/items/BarGraphContainerModel;",
        "component13",
        "()Lcom/whoop/design/models/items/AchievementProgressCardModel;",
        "component14",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component15",
        "component16",
        "()Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
        "component17",
        "()Lcom/whoop/design/models/items/MapModel;",
        "component18",
        "()Lcom/whoop/core/details/network/model/DetailsEditComponent;",
        "component19",
        "component20",
        "component21",
        "()Lcom/whoop/core/details/network/model/GraphTitleBar;",
        "component22",
        "()Lcom/whoop/core/details/network/model/SupplementalData;",
        "component23",
        "component24",
        "component25",
        "component26",
        "()Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;",
        "component27",
        "component28",
        "()Lcom/whoop/core/details/network/model/MetaData;",
        "component29",
        "component30",
        "copy",
        "(Lcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)Lcom/whoop/core/details/network/model/CoreDetailsModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_details_release",
        "(Lcom/whoop/core/details/network/model/CoreDetailsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/core/details/network/model/TitleBarModel;",
        "getTitleBar",
        "Lcom/whoop/design/models/items/CtaTileModel;",
        "getLinkWorkoutCtaTile",
        "Ljava/util/List;",
        "getOnboardingOverlays",
        "Lcom/whoop/design/models/items/StrainBreakDownModel;",
        "getStrainBreakdownModel",
        "getStrainBreakdownModel$annotations",
        "()V",
        "Ljava/lang/Boolean;",
        "getLinkWorkoutOptionEnabled",
        "Lcom/whoop/design/models/items/HorizontalStatModel;",
        "getHorizontalStat",
        "getHorizontalStats",
        "Lcom/whoop/design/models/items/KeyMetricCarouselModel;",
        "getKeyMetricCarousel",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "getGraphResponse",
        "Ljava/lang/String;",
        "getVowResponseString",
        "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "getWhoopCoachVow",
        "Lcom/whoop/design/models/items/BarGraphContainerModel;",
        "getHeartRateZoneContainer",
        "getHeartRateZoneContainer$annotations",
        "Lcom/whoop/design/models/items/AchievementProgressCardModel;",
        "getAchievementProgressCard",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getIntegrationPromoCard",
        "getMomentEntryPointTile",
        "Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
        "getAdditionalInfoText",
        "Lcom/whoop/design/models/items/MapModel;",
        "getMap",
        "Lcom/whoop/core/details/network/model/DetailsEditComponent;",
        "getDetailsEditComponents",
        "getGraphId",
        "getInitialGraphId",
        "Lcom/whoop/core/details/network/model/GraphTitleBar;",
        "getGraphTitleBar",
        "Lcom/whoop/core/details/network/model/SupplementalData;",
        "getSupplementalData",
        "getEditable",
        "getTags",
        "getTags$annotations",
        "getTagsV2",
        "Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;",
        "getWeightliftingCardioDetails",
        "getMenuOptions",
        "Lcom/whoop/core/details/network/model/MetaData;",
        "getMetadata",
        "getActivityTargetsMiniArch",
        "getActivityTargetsMiniArch$annotations",
        "getDesignItems",
        "getDesignItems$annotations",
        "Companion",
        "$serializer",
        "core-details_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/core/details/network/model/CoreDetailsModel$Companion;


# instance fields
.field private final achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

.field private final activityTargetsMiniArch:Lcom/whoop/design/models/DesignSystemModel;

.field private final additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

.field private final designItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

.field private final editable:Ljava/lang/Boolean;

.field private final graphId:Ljava/lang/String;

.field private final graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

.field private final graphTitleBar:Lcom/whoop/core/details/network/model/GraphTitleBar;

.field private final heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

.field private final horizontalStat:Lcom/whoop/design/models/items/HorizontalStatModel;

.field private final horizontalStats:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            ">;"
        }
    .end annotation
.end field

.field private final initialGraphId:Ljava/lang/String;

.field private final integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

.field private final keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

.field private final linkWorkoutCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

.field private final linkWorkoutOptionEnabled:Ljava/lang/Boolean;

.field private final map:Lcom/whoop/design/models/items/MapModel;

.field private final menuOptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/MenuOptionsItem;",
            ">;"
        }
    .end annotation
.end field

.field private final metadata:Lcom/whoop/core/details/network/model/MetaData;

.field private final momentEntryPointTile:Lcom/whoop/design/models/DesignSystemModel;

.field private final onboardingOverlays:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final strainBreakdownModel:Lcom/whoop/design/models/items/StrainBreakDownModel;

.field private final supplementalData:Lcom/whoop/core/details/network/model/SupplementalData;

.field private final tags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/TagModel;",
            ">;"
        }
    .end annotation
.end field

.field private final tagsV2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;"
        }
    .end annotation
.end field

.field private final titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

.field private final vowResponseString:Ljava/lang/String;

.field private final weightliftingCardioDetails:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;

.field private final whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    new-instance v0, Lcom/whoop/core/details/network/model/CoreDetailsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/core/details/network/model/CoreDetailsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->Companion:Lcom/whoop/core/details/network/model/CoreDetailsModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcj0/f;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, Lcj0/f;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lcj0/f;

    const/16 v6, 0x1c

    invoke-direct {v5, v6}, Lcj0/f;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lcj0/f;

    const/16 v8, 0x1d

    invoke-direct {v7, v8}, Lcj0/f;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lcom/whoop/core/details/network/model/a;

    const/4 v10, 0x0

    invoke-direct {v9, v10}, Lcom/whoop/core/details/network/model/a;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v9

    new-instance v11, Lcom/whoop/core/details/network/model/a;

    const/4 v12, 0x1

    invoke-direct {v11, v12}, Lcom/whoop/core/details/network/model/a;-><init>(I)V

    invoke-static {v2, v11}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v11

    new-instance v13, Lcom/whoop/core/details/network/model/a;

    const/4 v14, 0x2

    invoke-direct {v13, v14}, Lcom/whoop/core/details/network/model/a;-><init>(I)V

    invoke-static {v2, v13}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v13

    new-instance v15, Lcom/whoop/core/details/network/model/a;

    move/from16 v16, v0

    const/4 v0, 0x3

    invoke-direct {v15, v0}, Lcom/whoop/core/details/network/model/a;-><init>(I)V

    invoke-static {v2, v15}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v15

    move/from16 v17, v0

    new-instance v0, Lcom/whoop/core/details/network/model/a;

    move-object/from16 v18, v1

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/whoop/core/details/network/model/a;-><init>(I)V

    invoke-static {v2, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    move/from16 v19, v1

    new-instance v1, Lcom/whoop/core/details/network/model/a;

    move/from16 v20, v4

    const/4 v4, 0x5

    invoke-direct {v1, v4}, Lcom/whoop/core/details/network/model/a;-><init>(I)V

    invoke-static {v2, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    const/16 v2, 0x1e

    new-array v2, v2, [Ll83/h;

    aput-object v18, v2, v10

    aput-object v18, v2, v12

    aput-object v3, v2, v14

    aput-object v18, v2, v17

    aput-object v18, v2, v19

    aput-object v18, v2, v4

    const/4 v3, 0x6

    aput-object v5, v2, v3

    const/4 v3, 0x7

    aput-object v18, v2, v3

    aput-object v18, v2, v16

    const/16 v3, 0x9

    aput-object v18, v2, v3

    const/16 v3, 0xa

    aput-object v18, v2, v3

    const/16 v3, 0xb

    aput-object v18, v2, v3

    const/16 v3, 0xc

    aput-object v18, v2, v3

    const/16 v3, 0xd

    aput-object v7, v2, v3

    const/16 v3, 0xe

    aput-object v9, v2, v3

    const/16 v3, 0xf

    aput-object v18, v2, v3

    const/16 v3, 0x10

    aput-object v18, v2, v3

    const/16 v3, 0x11

    aput-object v18, v2, v3

    const/16 v3, 0x12

    aput-object v18, v2, v3

    const/16 v3, 0x13

    aput-object v18, v2, v3

    const/16 v3, 0x14

    aput-object v18, v2, v3

    const/16 v3, 0x15

    aput-object v18, v2, v3

    const/16 v3, 0x16

    aput-object v18, v2, v3

    const/16 v3, 0x17

    aput-object v11, v2, v3

    const/16 v3, 0x18

    aput-object v13, v2, v3

    const/16 v3, 0x19

    aput-object v18, v2, v3

    const/16 v3, 0x1a

    aput-object v15, v2, v3

    aput-object v18, v2, v20

    aput-object v0, v2, v6

    aput-object v1, v2, v8

    sput-object v2, Lcom/whoop/core/details/network/model/CoreDetailsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0xfff8fff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    iput-object p3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    iput-object p4, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->onboardingOverlays:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->strainBreakdownModel:Lcom/whoop/design/models/items/StrainBreakDownModel;

    iput-object p6, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutOptionEnabled:Ljava/lang/Boolean;

    iput-object p7, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    iput-object p8, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStats:Ljava/util/List;

    iput-object p9, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    iput-object p10, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    iput-object p11, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->vowResponseString:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    iput-object p13, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    and-int/lit16 p2, p1, 0x1000

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    goto :goto_0

    :cond_1
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    :goto_0
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_1

    :cond_2
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    :goto_1
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->momentEntryPointTile:Lcom/whoop/design/models/DesignSystemModel;

    :goto_2
    move-object/from16 p2, p17

    goto :goto_3

    :cond_3
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->momentEntryPointTile:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_2

    :goto_3
    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    move-object/from16 p2, p20

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphId:Ljava/lang/String;

    move-object/from16 p2, p21

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->initialGraphId:Ljava/lang/String;

    move-object/from16 p2, p22

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphTitleBar:Lcom/whoop/core/details/network/model/GraphTitleBar;

    move-object/from16 p2, p23

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->supplementalData:Lcom/whoop/core/details/network/model/SupplementalData;

    move-object/from16 p2, p24

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->editable:Ljava/lang/Boolean;

    move-object/from16 p2, p25

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tags:Ljava/util/List;

    move-object/from16 p2, p26

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tagsV2:Ljava/util/List;

    move-object/from16 p2, p27

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->weightliftingCardioDetails:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;

    move-object/from16 p2, p28

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->menuOptions:Ljava/util/List;

    move-object/from16 p2, p29

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    const/high16 p2, 0x10000000

    and-int/2addr p2, p1

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->activityTargetsMiniArch:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_4

    :cond_4
    move-object/from16 p2, p30

    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->activityTargetsMiniArch:Lcom/whoop/design/models/DesignSystemModel;

    :goto_4
    const/high16 p2, 0x20000000

    and-int/2addr p1, p2

    if-nez p1, :cond_5

    iput-object p3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->designItems:Ljava/util/List;

    return-void

    :cond_5
    move-object/from16 p1, p31

    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->designItems:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/core/details/network/model/TitleBarModel;",
            "Lcom/whoop/design/models/items/CtaTileModel;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/design/models/items/StrainBreakDownModel;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            ">;",
            "Lcom/whoop/design/models/items/KeyMetricCarouselModel;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            "Lcom/whoop/design/models/items/BarGraphContainerModel;",
            "Lcom/whoop/design/models/items/AchievementProgressCardModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
            "Lcom/whoop/design/models/items/MapModel;",
            "Lcom/whoop/core/details/network/model/DetailsEditComponent;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/core/details/network/model/GraphTitleBar;",
            "Lcom/whoop/core/details/network/model/SupplementalData;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/TagModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;",
            "Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/MenuOptionsItem;",
            ">;",
            "Lcom/whoop/core/details/network/model/MetaData;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p18

    move-object/from16 v1, p24

    const-string v2, "titleBar"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "horizontalStat"

    invoke-static {p6, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "horizontalStats"

    invoke-static {p7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "keyMetricCarousel"

    invoke-static {p8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "graphResponse"

    invoke-static {p9, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "detailsEditComponents"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "tags"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->onboardingOverlays:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->strainBreakdownModel:Lcom/whoop/design/models/items/StrainBreakDownModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutOptionEnabled:Ljava/lang/Boolean;

    .line 8
    iput-object p6, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStats:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    .line 12
    iput-object p10, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->vowResponseString:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    move-object p1, p12

    .line 14
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    move-object/from16 p1, p13

    .line 15
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    move-object/from16 p1, p14

    .line 16
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->momentEntryPointTile:Lcom/whoop/design/models/DesignSystemModel;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    .line 20
    iput-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphId:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->initialGraphId:Ljava/lang/String;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphTitleBar:Lcom/whoop/core/details/network/model/GraphTitleBar;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->supplementalData:Lcom/whoop/core/details/network/model/SupplementalData;

    move-object/from16 p1, p23

    .line 25
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->editable:Ljava/lang/Boolean;

    .line 26
    iput-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tags:Ljava/util/List;

    move-object/from16 p1, p25

    .line 27
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tagsV2:Ljava/util/List;

    move-object/from16 p1, p26

    .line 28
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->weightliftingCardioDetails:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;

    move-object/from16 p1, p27

    .line 29
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->menuOptions:Ljava/util/List;

    move-object/from16 p1, p28

    .line 30
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    move-object/from16 p1, p29

    .line 31
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->activityTargetsMiniArch:Lcom/whoop/design/models/DesignSystemModel;

    move-object/from16 p1, p30

    .line 32
    iput-object p1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->designItems:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 34

    move/from16 v0, p31

    and-int/lit16 v1, v0, 0x1000

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object/from16 v16, v2

    goto :goto_0

    :cond_0
    move-object/from16 v16, p13

    :goto_0
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_1

    move-object/from16 v17, v2

    goto :goto_1

    :cond_1
    move-object/from16 v17, p14

    :goto_1
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_2

    move-object/from16 v18, v2

    goto :goto_2

    :cond_2
    move-object/from16 v18, p15

    :goto_2
    const/high16 v1, 0x10000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_3

    move-object/from16 v32, v2

    goto :goto_3

    :cond_3
    move-object/from16 v32, p29

    :goto_3
    const/high16 v1, 0x20000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_4

    move-object/from16 v33, v2

    :goto_4
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move-object/from16 v19, p16

    move-object/from16 v20, p17

    move-object/from16 v21, p18

    move-object/from16 v22, p19

    move-object/from16 v23, p20

    move-object/from16 v24, p21

    move-object/from16 v25, p22

    move-object/from16 v26, p23

    move-object/from16 v27, p24

    move-object/from16 v28, p25

    move-object/from16 v29, p26

    move-object/from16 v30, p27

    move-object/from16 v31, p28

    goto :goto_5

    :cond_4
    move-object/from16 v33, p30

    goto :goto_4

    .line 33
    :goto_5
    invoke-direct/range {v3 .. v33}, Lcom/whoop/core/details/network/model/CoreDetailsModel;-><init>(Lcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/HorizontalStatModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/HorizontalStatModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/core/details/network/model/TagModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/TagModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$4()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$5()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/core/details/network/model/MenuOptionsItem$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/MenuOptionsItem$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$6()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$7()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/CoreDetailsModel;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/CoreDetailsModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/CoreDetailsModel;->_childSerializers$_anonymous_$6()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/core/details/network/model/CoreDetailsModel;Lcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/core/details/network/model/CoreDetailsModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p31

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->onboardingOverlays:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->strainBreakdownModel:Lcom/whoop/design/models/items/StrainBreakDownModel;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutOptionEnabled:Ljava/lang/Boolean;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStats:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->vowResponseString:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->momentEntryPointTile:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p31, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p31, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p31, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphId:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p31, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->initialGraphId:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p31, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphTitleBar:Lcom/whoop/core/details/network/model/GraphTitleBar;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p31, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->supplementalData:Lcom/whoop/core/details/network/model/SupplementalData;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p31, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->editable:Ljava/lang/Boolean;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p31, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tags:Ljava/util/List;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p31, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tagsV2:Ljava/util/List;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p31, v16

    move-object/from16 p11, v1

    if-eqz v16, :cond_19

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->weightliftingCardioDetails:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p31, v16

    move-object/from16 p12, v1

    if-eqz v16, :cond_1a

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->menuOptions:Ljava/util/List;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p31, v16

    move-object/from16 p13, v1

    if-eqz v16, :cond_1b

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p28

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p31, v16

    move-object/from16 p14, v1

    if-eqz v16, :cond_1c

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->activityTargetsMiniArch:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_1c

    :cond_1c
    move-object/from16 v1, p29

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, p31, v16

    if-eqz v16, :cond_1d

    move-object/from16 p15, v1

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->designItems:Ljava/util/List;

    move-object/from16 p30, p15

    move-object/from16 p31, v1

    :goto_1d
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p25, p10

    move-object/from16 p26, p11

    move-object/from16 p27, p12

    move-object/from16 p28, p13

    move-object/from16 p29, p14

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_1e

    :cond_1d
    move-object/from16 p31, p30

    move-object/from16 p30, v1

    goto :goto_1d

    :goto_1e
    invoke-virtual/range {p1 .. p31}, Lcom/whoop/core/details/network/model/CoreDetailsModel;->copy(Lcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)Lcom/whoop/core/details/network/model/CoreDetailsModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/CoreDetailsModel;->_childSerializers$_anonymous_$7()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/CoreDetailsModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/CoreDetailsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/CoreDetailsModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getActivityTargetsMiniArch$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "activity_targets_mini_arch"
    .end annotation

    return-void
.end method

.method public static synthetic getDesignItems$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "design_items"
    .end annotation

    return-void
.end method

.method public static synthetic getHeartRateZoneContainer$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "bar_graph_container"
    .end annotation

    return-void
.end method

.method public static synthetic getStrainBreakdownModel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "strain_breakdown"
    .end annotation

    return-void
.end method

.method public static synthetic getTags$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static synthetic h()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/CoreDetailsModel;->_childSerializers$_anonymous_$5()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/CoreDetailsModel;->_childSerializers$_anonymous_$4()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$core_details_release(Lcom/whoop/core/details/network/model/CoreDetailsModel;Lzc3/c;Lyc3/g;)V
    .locals 6

    sget-object v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/CtaTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CtaTileModel$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->onboardingOverlays:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/StrainBreakDownModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/StrainBreakDownModel$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->strainBreakdownModel:Lcom/whoop/design/models/items/StrainBreakDownModel;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutOptionEnabled:Ljava/lang/Boolean;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/items/HorizontalStatModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/HorizontalStatModel$$serializer;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    const/4 v4, 0x5

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStats:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    const/4 v4, 0x7

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    const/16 v4, 0x8

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->vowResponseString:Ljava/lang/String;

    const/16 v4, 0x9

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v3, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    const/16 v5, 0xa

    invoke-interface {p1, p2, v5, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v3, Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    const/16 v5, 0xb

    invoke-interface {p1, p2, v5, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0xc

    invoke-interface {p1, p2, v3}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    if-eqz v4, :cond_1

    :goto_0
    sget-object v4, Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;

    iget-object v5, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    invoke-interface {p1, p2, v3, v4, v5}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/16 v3, 0xd

    invoke-interface {p1, p2, v3}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    iget-object v4, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v4, :cond_3

    :goto_1
    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/j;

    iget-object v5, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v3, v4, v5}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v3, 0xe

    invoke-interface {p1, p2, v3}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    iget-object v4, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->momentEntryPointTile:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v4, :cond_5

    :goto_2
    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/j;

    iget-object v5, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->momentEntryPointTile:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v3, v4, v5}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    sget-object v3, Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    const/16 v5, 0xf

    invoke-interface {p1, p2, v5, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v3, Lcom/whoop/design/models/items/MapModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MapModel$$serializer;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    const/16 v5, 0x10

    invoke-interface {p1, p2, v5, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v3, Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    const/16 v5, 0x11

    invoke-interface {p1, p2, v5, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0x12

    iget-object v4, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphId:Ljava/lang/String;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0x13

    iget-object v4, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->initialGraphId:Ljava/lang/String;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/core/details/network/model/GraphTitleBar$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/GraphTitleBar$$serializer;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphTitleBar:Lcom/whoop/core/details/network/model/GraphTitleBar;

    const/16 v4, 0x14

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/core/details/network/model/SupplementalData$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/SupplementalData$$serializer;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->supplementalData:Lcom/whoop/core/details/network/model/SupplementalData;

    const/16 v4, 0x15

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x16

    iget-object v3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->editable:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x17

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tags:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x18

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tagsV2:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/core/details/network/model/WeightliftingCardioDetails$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->weightliftingCardioDetails:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;

    const/16 v3, 0x19

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x1a

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->menuOptions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/core/details/network/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/MetaData$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    const/16 v3, 0x1b

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x1c

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->activityTargetsMiniArch:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->activityTargetsMiniArch:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0x1d

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->designItems:Ljava/util/List;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->designItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/core/details/network/model/TitleBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->vowResponseString:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-object v0
.end method

.method public final component12()Lcom/whoop/design/models/items/BarGraphContainerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    return-object v0
.end method

.method public final component13()Lcom/whoop/design/models/items/AchievementProgressCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    return-object v0
.end method

.method public final component14()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component15()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->momentEntryPointTile:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component16()Lcom/whoop/design/models/items/AdditionalInfoTextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    return-object v0
.end method

.method public final component17()Lcom/whoop/design/models/items/MapModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    return-object v0
.end method

.method public final component18()Lcom/whoop/core/details/network/model/DetailsEditComponent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->initialGraphId:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Lcom/whoop/core/details/network/model/GraphTitleBar;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphTitleBar:Lcom/whoop/core/details/network/model/GraphTitleBar;

    return-object v0
.end method

.method public final component22()Lcom/whoop/core/details/network/model/SupplementalData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->supplementalData:Lcom/whoop/core/details/network/model/SupplementalData;

    return-object v0
.end method

.method public final component23()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->editable:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component24()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/TagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tags:Ljava/util/List;

    return-object v0
.end method

.method public final component25()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tagsV2:Ljava/util/List;

    return-object v0
.end method

.method public final component26()Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->weightliftingCardioDetails:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;

    return-object v0
.end method

.method public final component27()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/MenuOptionsItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->menuOptions:Ljava/util/List;

    return-object v0
.end method

.method public final component28()Lcom/whoop/core/details/network/model/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    return-object v0
.end method

.method public final component29()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->activityTargetsMiniArch:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->onboardingOverlays:Ljava/util/List;

    return-object v0
.end method

.method public final component30()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->designItems:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/StrainBreakDownModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->strainBreakdownModel:Lcom/whoop/design/models/items/StrainBreakDownModel;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutOptionEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/HorizontalStatModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStats:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/KeyMetricCarouselModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)Lcom/whoop/core/details/network/model/CoreDetailsModel;
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/core/details/network/model/TitleBarModel;",
            "Lcom/whoop/design/models/items/CtaTileModel;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/design/models/items/StrainBreakDownModel;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            ">;",
            "Lcom/whoop/design/models/items/KeyMetricCarouselModel;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            "Lcom/whoop/design/models/items/BarGraphContainerModel;",
            "Lcom/whoop/design/models/items/AchievementProgressCardModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
            "Lcom/whoop/design/models/items/MapModel;",
            "Lcom/whoop/core/details/network/model/DetailsEditComponent;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/core/details/network/model/GraphTitleBar;",
            "Lcom/whoop/core/details/network/model/SupplementalData;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/TagModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;",
            "Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/MenuOptionsItem;",
            ">;",
            "Lcom/whoop/core/details/network/model/MetaData;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/core/details/network/model/CoreDetailsModel;"
        }
    .end annotation

    const-string v0, "titleBar"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "horizontalStat"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "horizontalStats"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyMetricCarousel"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graphResponse"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsEditComponents"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tags"

    move-object/from16 v3, p24

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/core/details/network/model/CoreDetailsModel;

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v26, p25

    move-object/from16 v27, p26

    move-object/from16 v28, p27

    move-object/from16 v29, p28

    move-object/from16 v30, p29

    move-object/from16 v31, p30

    move-object/from16 v25, v3

    move-object/from16 v3, p2

    invoke-direct/range {v1 .. v31}, Lcom/whoop/core/details/network/model/CoreDetailsModel;-><init>(Lcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->onboardingOverlays:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->onboardingOverlays:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->strainBreakdownModel:Lcom/whoop/design/models/items/StrainBreakDownModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->strainBreakdownModel:Lcom/whoop/design/models/items/StrainBreakDownModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutOptionEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutOptionEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStats:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStats:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->vowResponseString:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->vowResponseString:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->momentEntryPointTile:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->momentEntryPointTile:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->initialGraphId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->initialGraphId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphTitleBar:Lcom/whoop/core/details/network/model/GraphTitleBar;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphTitleBar:Lcom/whoop/core/details/network/model/GraphTitleBar;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->supplementalData:Lcom/whoop/core/details/network/model/SupplementalData;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->supplementalData:Lcom/whoop/core/details/network/model/SupplementalData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->editable:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->editable:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tags:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tags:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tagsV2:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tagsV2:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->weightliftingCardioDetails:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->weightliftingCardioDetails:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->menuOptions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->menuOptions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->activityTargetsMiniArch:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->activityTargetsMiniArch:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->designItems:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/core/details/network/model/CoreDetailsModel;->designItems:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1f

    return v2

    :cond_1f
    return v0
.end method

.method public final getAchievementProgressCard()Lcom/whoop/design/models/items/AchievementProgressCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    return-object v0
.end method

.method public final getActivityTargetsMiniArch()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->activityTargetsMiniArch:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getAdditionalInfoText()Lcom/whoop/design/models/items/AdditionalInfoTextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    return-object v0
.end method

.method public final getDesignItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->designItems:Ljava/util/List;

    return-object v0
.end method

.method public final getDetailsEditComponents()Lcom/whoop/core/details/network/model/DetailsEditComponent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    return-object v0
.end method

.method public final getEditable()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->editable:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getGraphId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphId:Ljava/lang/String;

    return-object v0
.end method

.method public final getGraphResponse()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final getGraphTitleBar()Lcom/whoop/core/details/network/model/GraphTitleBar;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphTitleBar:Lcom/whoop/core/details/network/model/GraphTitleBar;

    return-object v0
.end method

.method public final getHeartRateZoneContainer()Lcom/whoop/design/models/items/BarGraphContainerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    return-object v0
.end method

.method public final getHorizontalStat()Lcom/whoop/design/models/items/HorizontalStatModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    return-object v0
.end method

.method public final getHorizontalStats()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStats:Ljava/util/List;

    return-object v0
.end method

.method public final getInitialGraphId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->initialGraphId:Ljava/lang/String;

    return-object v0
.end method

.method public final getIntegrationPromoCard()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getKeyMetricCarousel()Lcom/whoop/design/models/items/KeyMetricCarouselModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    return-object v0
.end method

.method public final getLinkWorkoutCtaTile()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public final getLinkWorkoutOptionEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutOptionEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getMap()Lcom/whoop/design/models/items/MapModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    return-object v0
.end method

.method public final getMenuOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/MenuOptionsItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->menuOptions:Ljava/util/List;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/core/details/network/model/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    return-object v0
.end method

.method public final getMomentEntryPointTile()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->momentEntryPointTile:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getOnboardingOverlays()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->onboardingOverlays:Ljava/util/List;

    return-object v0
.end method

.method public final getStrainBreakdownModel()Lcom/whoop/design/models/items/StrainBreakDownModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->strainBreakdownModel:Lcom/whoop/design/models/items/StrainBreakDownModel;

    return-object v0
.end method

.method public final getSupplementalData()Lcom/whoop/core/details/network/model/SupplementalData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->supplementalData:Lcom/whoop/core/details/network/model/SupplementalData;

    return-object v0
.end method

.method public final getTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/TagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tags:Ljava/util/List;

    return-object v0
.end method

.method public final getTagsV2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tagsV2:Ljava/util/List;

    return-object v0
.end method

.method public final getTitleBar()Lcom/whoop/core/details/network/model/TitleBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    return-object v0
.end method

.method public final getVowResponseString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->vowResponseString:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeightliftingCardioDetails()Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->weightliftingCardioDetails:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;

    return-object v0
.end method

.method public final getWhoopCoachVow()Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/TitleBarModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/items/CtaTileModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->onboardingOverlays:Ljava/util/List;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->strainBreakdownModel:Lcom/whoop/design/models/items/StrainBreakDownModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/StrainBreakDownModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutOptionEnabled:Ljava/lang/Boolean;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/HorizontalStatModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStats:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/GraphModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->vowResponseString:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/design/models/items/WhoopCoachVowModel;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/whoop/design/models/items/BarGraphContainerModel;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->momentEntryPointTile:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Lcom/whoop/design/models/items/AdditionalInfoTextModel;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Lcom/whoop/design/models/items/MapModel;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/DetailsEditComponent;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphId:Ljava/lang/String;

    if-nez v0, :cond_c

    move v0, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_c
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->initialGraphId:Ljava/lang/String;

    if-nez v0, :cond_d

    move v0, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_d
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphTitleBar:Lcom/whoop/core/details/network/model/GraphTitleBar;

    if-nez v0, :cond_e

    move v0, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/GraphTitleBar;->hashCode()I

    move-result v0

    :goto_e
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->supplementalData:Lcom/whoop/core/details/network/model/SupplementalData;

    if-nez v0, :cond_f

    move v0, v3

    goto :goto_f

    :cond_f
    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/SupplementalData;->hashCode()I

    move-result v0

    :goto_f
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->editable:Ljava/lang/Boolean;

    if-nez v0, :cond_10

    move v0, v3

    goto :goto_10

    :cond_10
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_10
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tags:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tagsV2:Ljava/util/List;

    if-nez v2, :cond_11

    move v2, v3

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->weightliftingCardioDetails:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;

    if-nez v2, :cond_12

    move v2, v3

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;->hashCode()I

    move-result v2

    :goto_12
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->menuOptions:Ljava/util/List;

    if-nez v2, :cond_13

    move v2, v3

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_13
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    if-nez v2, :cond_14

    move v2, v3

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/MetaData;->hashCode()I

    move-result v2

    :goto_14
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->activityTargetsMiniArch:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_15

    move v2, v3

    goto :goto_15

    :cond_15
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_15
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->designItems:Ljava/util/List;

    if-nez v1, :cond_16

    goto :goto_16

    :cond_16
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_16
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 32

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    iget-object v2, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    iget-object v3, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->onboardingOverlays:Ljava/util/List;

    iget-object v4, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->strainBreakdownModel:Lcom/whoop/design/models/items/StrainBreakDownModel;

    iget-object v5, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->linkWorkoutOptionEnabled:Ljava/lang/Boolean;

    iget-object v6, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    iget-object v7, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->horizontalStats:Ljava/util/List;

    iget-object v8, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    iget-object v9, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v10, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->vowResponseString:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    iget-object v12, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    iget-object v13, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    iget-object v14, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->momentEntryPointTile:Lcom/whoop/design/models/DesignSystemModel;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphId:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->initialGraphId:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->graphTitleBar:Lcom/whoop/core/details/network/model/GraphTitleBar;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->supplementalData:Lcom/whoop/core/details/network/model/SupplementalData;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->editable:Ljava/lang/Boolean;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tags:Ljava/util/List;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->tagsV2:Ljava/util/List;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->weightliftingCardioDetails:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;

    move-object/from16 v27, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->menuOptions:Ljava/util/List;

    move-object/from16 v28, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    move-object/from16 v29, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->activityTargetsMiniArch:Lcom/whoop/design/models/DesignSystemModel;

    move-object/from16 v30, v15

    iget-object v15, v0, Lcom/whoop/core/details/network/model/CoreDetailsModel;->designItems:Ljava/util/List;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v31, v15

    const-string v15, "CoreDetailsModel(titleBar="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", linkWorkoutCtaTile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onboardingOverlays="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", strainBreakdownModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", linkWorkoutOptionEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalStat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", keyMetricCarousel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", graphResponse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", vowResponseString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", whoopCoachVow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", heartRateZoneContainer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", achievementProgressCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", integrationPromoCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", momentEntryPointTile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", additionalInfoText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", map="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", detailsEditComponents="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", graphId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", initialGraphId="

    const-string v2, ", graphTitleBar="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", supplementalData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", editable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tagsV2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", weightliftingCardioDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", menuOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activityTargetsMiniArch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", designItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
