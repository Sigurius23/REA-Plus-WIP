.class public final Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/activation/domain/models/ActivationFlowStepModel;
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;,
        Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008(\u0008\u0087\u0008\u0018\u0000 \u0081\u00012\u00020\u00012\u00020\u0002:\u0004\u0082\u0001\u0081\u0001B\u00fd\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u0012\u0006\u0010\r\u001a\u00020\u0008\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0008\u0012\u0006\u0010\u001b\u001a\u00020\u0008\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u001f\u001a\u00020\u0008\u0012\u0006\u0010 \u001a\u00020\u0008\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0010\u0008\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#\u00a2\u0006\u0004\u0008%\u0010&B\u00ab\u0002\u0008\u0010\u0012\u0006\u0010\'\u001a\u00020\u000e\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010!\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#\u0012\u0008\u0010)\u001a\u0004\u0018\u00010(\u00a2\u0006\u0004\u0008%\u0010*J\u0010\u0010+\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010,J\u0010\u0010.\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010,J\u0010\u0010/\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010,J\u0010\u00100\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u00082\u00101J\u0010\u00103\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00101J\u0010\u00104\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00101J\u0010\u00105\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00101J\u0010\u00106\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u00088\u00107J\u0010\u00109\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u00089\u00107J\u0010\u0010:\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008:\u00107J\u0010\u0010;\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008;\u00107J\u0010\u0010<\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008<\u00107J\u0010\u0010=\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008=\u00107J\u0010\u0010>\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008>\u00107J\u0010\u0010?\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008?\u00107J\u0010\u0010@\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008@\u00107J\u0010\u0010A\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008A\u0010,J\u0010\u0010B\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008B\u00101J\u0010\u0010C\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008C\u00101J\u0010\u0010D\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008D\u00107J\u0010\u0010E\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008E\u00107J\u0012\u0010F\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008F\u00101J\u0010\u0010G\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008G\u00101J\u0010\u0010H\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008H\u00101J\u0012\u0010I\u001a\u0004\u0018\u00010!H\u00c6\u0003\u00a2\u0006\u0004\u0008I\u0010JJ\u0018\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#H\u00c6\u0003\u00a2\u0006\u0004\u0008K\u0010LJ\u00be\u0002\u0010M\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00082\u0008\u0008\u0002\u0010\r\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u000e2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u00082\u0008\u0008\u0002\u0010 \u001a\u00020\u00082\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u0010\u0008\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#H\u00c6\u0001\u00a2\u0006\u0004\u0008M\u0010NJ\u0010\u0010O\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008O\u00101J\u0010\u0010P\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008P\u00107J\u001a\u0010T\u001a\u00020S2\u0008\u0010R\u001a\u0004\u0018\u00010QH\u00d6\u0003\u00a2\u0006\u0004\u0008T\u0010UJ\'\u0010^\u001a\u00020[2\u0006\u0010V\u001a\u00020\u00002\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020YH\u0001\u00a2\u0006\u0004\u0008\\\u0010]R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010_\u001a\u0004\u0008`\u0010,R\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010_\u001a\u0004\u0008a\u0010,R\u0017\u0010\u0006\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010_\u001a\u0004\u0008b\u0010,R\u0017\u0010\u0007\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010_\u001a\u0004\u0008c\u0010,R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010d\u001a\u0004\u0008e\u00101R\u0017\u0010\n\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010d\u001a\u0004\u0008f\u00101R\u0017\u0010\u000b\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010d\u001a\u0004\u0008g\u00101R\u0017\u0010\u000c\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010d\u001a\u0004\u0008h\u00101R\u0017\u0010\r\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010d\u001a\u0004\u0008i\u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010j\u001a\u0004\u0008k\u00107R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010j\u001a\u0004\u0008l\u00107R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010j\u001a\u0004\u0008m\u00107R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010j\u001a\u0004\u0008n\u00107R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010j\u001a\u0004\u0008o\u00107R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010j\u001a\u0004\u0008p\u00107R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010j\u001a\u0004\u0008q\u00107R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010j\u001a\u0004\u0008r\u00107R\u0017\u0010\u0017\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010j\u001a\u0004\u0008s\u00107R\u0017\u0010\u0018\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010j\u001a\u0004\u0008t\u00107R\u0017\u0010\u0019\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010_\u001a\u0004\u0008u\u0010,R\u0017\u0010\u001a\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010d\u001a\u0004\u0008v\u00101R\u0017\u0010\u001b\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010d\u001a\u0004\u0008w\u00101R\u0017\u0010\u001c\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010j\u001a\u0004\u0008x\u00107R\u0017\u0010\u001d\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010j\u001a\u0004\u0008y\u00107R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010d\u001a\u0004\u0008z\u00101R\u001a\u0010\u001f\u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010d\u001a\u0004\u0008{\u00101R\u001a\u0010 \u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010d\u001a\u0004\u0008|\u00101R\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010}\u001a\u0004\u0008~\u0010JR#\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0016X\u0096\u0004\u00a2\u0006\r\n\u0004\u0008$\u0010\u007f\u001a\u0005\u0008\u0080\u0001\u0010L\u00a8\u0006\u0083\u0001"
    }
    d2 = {
        "Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;",
        "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/util/TextResource;",
        "imperialTitle",
        "metricTitle",
        "heightTitle",
        "weightTitle",
        "",
        "feetText",
        "inchesText",
        "poundsText",
        "centimetersText",
        "kilogramsText",
        "",
        "heightFeetMinValue",
        "heightFeetMaxValue",
        "weightPoundsMinValue",
        "weightPoundsMaxValue",
        "heightCentimetersMinValue",
        "heightCentimetersMaxValue",
        "heightCentimetersPreselectedValue",
        "weightKilogramsMinValue",
        "weightKilogramsMaxValue",
        "weightKilogramsPreselectedValue",
        "title",
        "subtitle",
        "imageUrl",
        "heightFeetPreselectedValue",
        "weightPoundsPreselectedValue",
        "navigationBarText",
        "mobileScreenName",
        "analyticsName",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "progressCircle",
        "",
        "footerButtons",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/lang/String;",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "()I",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "()Lcom/whoop/design/models/ProgressButtonModel;",
        "component29",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$activation_release",
        "(Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/util/TextResource;",
        "getImperialTitle",
        "getMetricTitle",
        "getHeightTitle",
        "getWeightTitle",
        "Ljava/lang/String;",
        "getFeetText",
        "getInchesText",
        "getPoundsText",
        "getCentimetersText",
        "getKilogramsText",
        "I",
        "getHeightFeetMinValue",
        "getHeightFeetMaxValue",
        "getWeightPoundsMinValue",
        "getWeightPoundsMaxValue",
        "getHeightCentimetersMinValue",
        "getHeightCentimetersMaxValue",
        "getHeightCentimetersPreselectedValue",
        "getWeightKilogramsMinValue",
        "getWeightKilogramsMaxValue",
        "getWeightKilogramsPreselectedValue",
        "getTitle",
        "getSubtitle",
        "getImageUrl",
        "getHeightFeetPreselectedValue",
        "getWeightPoundsPreselectedValue",
        "getNavigationBarText",
        "getMobileScreenName",
        "getAnalyticsName",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "getProgressCircle",
        "Ljava/util/List;",
        "getFooterButtons",
        "Companion",
        "$serializer",
        "activation_release"
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

.field public static final Companion:Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$Companion;


# instance fields
.field private final analyticsName:Ljava/lang/String;

.field private final centimetersText:Ljava/lang/String;

.field private final feetText:Ljava/lang/String;

.field private final footerButtons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final heightCentimetersMaxValue:I

.field private final heightCentimetersMinValue:I

.field private final heightCentimetersPreselectedValue:I

.field private final heightFeetMaxValue:I

.field private final heightFeetMinValue:I

.field private final heightFeetPreselectedValue:I

.field private final heightTitle:Lcom/whoop/design/util/TextResource;

.field private final imageUrl:Ljava/lang/String;

.field private final imperialTitle:Lcom/whoop/design/util/TextResource;

.field private final inchesText:Ljava/lang/String;

.field private final kilogramsText:Ljava/lang/String;

.field private final metricTitle:Lcom/whoop/design/util/TextResource;

.field private final mobileScreenName:Ljava/lang/String;

.field private final navigationBarText:Ljava/lang/String;

.field private final poundsText:Ljava/lang/String;

.field private final progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

.field private final subtitle:Ljava/lang/String;

.field private final title:Lcom/whoop/design/util/TextResource;

.field private final weightKilogramsMaxValue:I

.field private final weightKilogramsMinValue:I

.field private final weightKilogramsPreselectedValue:I

.field private final weightPoundsMaxValue:I

.field private final weightPoundsMinValue:I

.field private final weightPoundsPreselectedValue:I

.field private final weightTitle:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->Companion:Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lr70/a;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Lr70/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0x1d

    new-array v3, v3, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v5, 0x1

    aput-object v1, v3, v5

    const/4 v5, 0x2

    aput-object v1, v3, v5

    const/4 v5, 0x3

    aput-object v1, v3, v5

    const/4 v5, 0x4

    aput-object v1, v3, v5

    const/4 v5, 0x5

    aput-object v1, v3, v5

    const/4 v5, 0x6

    aput-object v1, v3, v5

    const/4 v5, 0x7

    aput-object v1, v3, v5

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    const/16 v0, 0xb

    aput-object v1, v3, v0

    const/16 v0, 0xc

    aput-object v1, v3, v0

    const/16 v0, 0xd

    aput-object v1, v3, v0

    const/16 v0, 0xe

    aput-object v1, v3, v0

    aput-object v1, v3, v4

    const/16 v0, 0x10

    aput-object v1, v3, v0

    const/16 v0, 0x11

    aput-object v1, v3, v0

    const/16 v0, 0x12

    aput-object v1, v3, v0

    const/16 v0, 0x13

    aput-object v1, v3, v0

    const/16 v0, 0x14

    aput-object v1, v3, v0

    const/16 v0, 0x15

    aput-object v1, v3, v0

    const/16 v0, 0x16

    aput-object v1, v3, v0

    const/16 v0, 0x17

    aput-object v1, v3, v0

    const/16 v0, 0x18

    aput-object v1, v3, v0

    const/16 v0, 0x19

    aput-object v1, v3, v0

    const/16 v0, 0x1a

    aput-object v1, v3, v0

    const/16 v0, 0x1b

    aput-object v1, v3, v0

    const/16 v0, 0x1c

    aput-object v2, v3, v0

    sput-object v3, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0xfffffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imperialTitle:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->metricTitle:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightTitle:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightTitle:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->feetText:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->inchesText:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->poundsText:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->centimetersText:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->kilogramsText:Ljava/lang/String;

    iput p11, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMinValue:I

    iput p12, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMaxValue:I

    iput p13, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMinValue:I

    move/from16 p2, p14

    iput p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMaxValue:I

    move/from16 p2, p15

    iput p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMinValue:I

    move/from16 p2, p16

    iput p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMaxValue:I

    move/from16 p2, p17

    iput p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersPreselectedValue:I

    move/from16 p2, p18

    iput p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMinValue:I

    move/from16 p2, p19

    iput p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMaxValue:I

    move/from16 p2, p20

    iput p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsPreselectedValue:I

    move-object/from16 p2, p21

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->title:Lcom/whoop/design/util/TextResource;

    move-object/from16 p2, p22

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->subtitle:Ljava/lang/String;

    move-object/from16 p2, p23

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imageUrl:Ljava/lang/String;

    move/from16 p2, p24

    iput p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetPreselectedValue:I

    move/from16 p2, p25

    iput p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsPreselectedValue:I

    move-object/from16 p2, p26

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->navigationBarText:Ljava/lang/String;

    move-object/from16 p2, p27

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->mobileScreenName:Ljava/lang/String;

    move-object/from16 p2, p28

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->analyticsName:Ljava/lang/String;

    move-object/from16 p2, p29

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    const/high16 p2, 0x10000000

    and-int/2addr p1, p2

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 3
    :goto_0
    iput-object p1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->footerButtons:Ljava/util/List;

    return-void

    :cond_1
    move-object/from16 p1, p30

    goto :goto_0
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIIIIIIIII",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/ProgressButtonModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p20

    move-object/from16 v11, p21

    move-object/from16 v12, p22

    move-object/from16 v13, p26

    move-object/from16 v14, p27

    const-string v15, "imperialTitle"

    invoke-static {v1, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "metricTitle"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "heightTitle"

    invoke-static {v3, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "weightTitle"

    invoke-static {v4, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "feetText"

    invoke-static {v5, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "inchesText"

    invoke-static {v6, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "poundsText"

    invoke-static {v7, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "centimetersText"

    invoke-static {v8, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "kilogramsText"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "title"

    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "subtitle"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "imageUrl"

    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "mobileScreenName"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "analyticsName"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imperialTitle:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object v2, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->metricTitle:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-object v3, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightTitle:Lcom/whoop/design/util/TextResource;

    .line 8
    iput-object v4, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightTitle:Lcom/whoop/design/util/TextResource;

    .line 9
    iput-object v5, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->feetText:Ljava/lang/String;

    .line 10
    iput-object v6, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->inchesText:Ljava/lang/String;

    .line 11
    iput-object v7, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->poundsText:Ljava/lang/String;

    .line 12
    iput-object v8, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->centimetersText:Ljava/lang/String;

    .line 13
    iput-object v9, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->kilogramsText:Ljava/lang/String;

    move/from16 v1, p10

    .line 14
    iput v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMinValue:I

    move/from16 v1, p11

    .line 15
    iput v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMaxValue:I

    move/from16 v1, p12

    .line 16
    iput v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMinValue:I

    move/from16 v1, p13

    .line 17
    iput v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMaxValue:I

    move/from16 v1, p14

    .line 18
    iput v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMinValue:I

    move/from16 v1, p15

    .line 19
    iput v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMaxValue:I

    move/from16 v1, p16

    .line 20
    iput v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersPreselectedValue:I

    move/from16 v1, p17

    .line 21
    iput v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMinValue:I

    move/from16 v1, p18

    .line 22
    iput v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMaxValue:I

    move/from16 v1, p19

    .line 23
    iput v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsPreselectedValue:I

    .line 24
    iput-object v10, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->title:Lcom/whoop/design/util/TextResource;

    .line 25
    iput-object v11, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->subtitle:Ljava/lang/String;

    .line 26
    iput-object v12, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imageUrl:Ljava/lang/String;

    move/from16 v1, p23

    .line 27
    iput v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetPreselectedValue:I

    move/from16 v1, p24

    .line 28
    iput v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsPreselectedValue:I

    move-object/from16 v1, p25

    .line 29
    iput-object v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->navigationBarText:Ljava/lang/String;

    .line 30
    iput-object v13, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->mobileScreenName:Ljava/lang/String;

    .line 31
    iput-object v14, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->analyticsName:Ljava/lang/String;

    move-object/from16 v1, p28

    .line 32
    iput-object v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    move-object/from16 v1, p29

    .line 33
    iput-object v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->footerButtons:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 31

    const/high16 v0, 0x10000000

    and-int v0, p30, v0

    if-eqz v0, :cond_0

    .line 34
    sget-object v0, Lm83/y;->w:Lm83/y;

    move-object/from16 v30, v0

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move/from16 v24, p23

    move/from16 v25, p24

    move-object/from16 v26, p25

    move-object/from16 v27, p26

    move-object/from16 v28, p27

    move-object/from16 v29, p28

    goto :goto_1

    :cond_0
    move-object/from16 v30, p29

    goto :goto_0

    .line 35
    :goto_1
    invoke-direct/range {v1 .. v30}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p30

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imperialTitle:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->metricTitle:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightTitle:Lcom/whoop/design/util/TextResource;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightTitle:Lcom/whoop/design/util/TextResource;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->feetText:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->inchesText:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->poundsText:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->centimetersText:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->kilogramsText:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMinValue:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMaxValue:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMinValue:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMaxValue:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMinValue:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMaxValue:I

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersPreselectedValue:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p30, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMinValue:I

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p30, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMaxValue:I

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p30, v16

    move/from16 p4, v1

    if-eqz v16, :cond_12

    iget v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsPreselectedValue:I

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p30, v16

    move/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->title:Lcom/whoop/design/util/TextResource;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p30, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->subtitle:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p30, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imageUrl:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p30, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetPreselectedValue:I

    goto :goto_16

    :cond_16
    move/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p30, v16

    move/from16 p9, v1

    if-eqz v16, :cond_17

    iget v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsPreselectedValue:I

    goto :goto_17

    :cond_17
    move/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p30, v16

    move/from16 p10, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->navigationBarText:Ljava/lang/String;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p30, v16

    move-object/from16 p11, v1

    if-eqz v16, :cond_19

    iget-object v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->mobileScreenName:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p30, v16

    move-object/from16 p12, v1

    if-eqz v16, :cond_1a

    iget-object v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->analyticsName:Ljava/lang/String;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p30, v16

    move-object/from16 p13, v1

    if-eqz v16, :cond_1b

    iget-object v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p28

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p30, v16

    if-eqz v16, :cond_1c

    move-object/from16 p14, v1

    iget-object v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->footerButtons:Ljava/util/List;

    move-object/from16 p29, p14

    move-object/from16 p30, v1

    :goto_1c
    move/from16 p17, p2

    move/from16 p18, p3

    move/from16 p19, p4

    move/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move/from16 p24, p9

    move/from16 p25, p10

    move-object/from16 p26, p11

    move-object/from16 p27, p12

    move-object/from16 p28, p13

    move/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_1d

    :cond_1c
    move-object/from16 p30, p29

    move-object/from16 p29, v1

    goto :goto_1c

    :goto_1d
    invoke-virtual/range {p1 .. p30}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$activation_release(Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imperialTitle:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->metricTitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightTitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightTitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->feetText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->inchesText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->poundsText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->centimetersText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->kilogramsText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v2, 0x9

    iget v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMinValue:I

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v2, 0xa

    iget v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMaxValue:I

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v2, 0xb

    iget v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMinValue:I

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v2, 0xc

    iget v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMaxValue:I

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v2, 0xd

    iget v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMinValue:I

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v2, 0xe

    iget v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMaxValue:I

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v2, 0xf

    iget v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersPreselectedValue:I

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v2, 0x10

    iget v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMinValue:I

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v2, 0x11

    iget v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMaxValue:I

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v2, 0x12

    iget v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsPreselectedValue:I

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v2, 0x13

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x14

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x15

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x16

    iget v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetPreselectedValue:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v1, 0x17

    iget v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsPreselectedValue:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getNavigationBarText()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x18

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x19

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getMobileScreenName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x1a

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/design/models/ProgressButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ProgressButtonModel$$serializer;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getProgressCircle()Lcom/whoop/design/models/ProgressButtonModel;

    move-result-object v2

    const/16 v3, 0x1b

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x1c

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getFooterButtons()Ljava/util/List;

    move-result-object v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->getFooterButtons()Ljava/util/List;

    move-result-object p0

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imperialTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMinValue:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMaxValue:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMinValue:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMaxValue:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMinValue:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMaxValue:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersPreselectedValue:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMinValue:I

    return v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMaxValue:I

    return v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsPreselectedValue:I

    return v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->metricTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component20()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetPreselectedValue:I

    return v0
.end method

.method public final component24()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsPreselectedValue:I

    return v0
.end method

.method public final component25()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->navigationBarText:Ljava/lang/String;

    return-object v0
.end method

.method public final component26()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->mobileScreenName:Ljava/lang/String;

    return-object v0
.end method

.method public final component27()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->analyticsName:Ljava/lang/String;

    return-object v0
.end method

.method public final component28()Lcom/whoop/design/models/ProgressButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    return-object v0
.end method

.method public final component29()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->footerButtons:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->feetText:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->inchesText:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->poundsText:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->centimetersText:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->kilogramsText:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIIIIIIIII",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/ProgressButtonModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;"
        }
    .end annotation

    const-string v0, "imperialTitle"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricTitle"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heightTitle"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weightTitle"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feetText"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inchesText"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "poundsText"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "centimetersText"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kilogramsText"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v1, p20

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    move-object/from16 v11, p21

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    move-object/from16 v12, p22

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mobileScreenName"

    move-object/from16 v13, p26

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsName"

    move-object/from16 v14, p27

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v21, p20

    move/from16 v24, p23

    move/from16 v25, p24

    move-object/from16 v26, p25

    move-object/from16 v29, p28

    move-object/from16 v30, p29

    move-object/from16 v22, v11

    move-object/from16 v23, v12

    move-object/from16 v27, v13

    move-object/from16 v28, v14

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    invoke-direct/range {v1 .. v30}, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imperialTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imperialTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->metricTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->metricTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->feetText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->feetText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->inchesText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->inchesText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->poundsText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->poundsText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->centimetersText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->centimetersText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->kilogramsText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->kilogramsText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMinValue:I

    iget v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMinValue:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMaxValue:I

    iget v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMaxValue:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMinValue:I

    iget v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMinValue:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMaxValue:I

    iget v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMaxValue:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMinValue:I

    iget v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMinValue:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMaxValue:I

    iget v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMaxValue:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersPreselectedValue:I

    iget v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersPreselectedValue:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMinValue:I

    iget v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMinValue:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMaxValue:I

    iget v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMaxValue:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsPreselectedValue:I

    iget v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsPreselectedValue:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetPreselectedValue:I

    iget v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetPreselectedValue:I

    if-eq v1, v3, :cond_18

    return v2

    :cond_18
    iget v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsPreselectedValue:I

    iget v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsPreselectedValue:I

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->navigationBarText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->navigationBarText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->mobileScreenName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->mobileScreenName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->analyticsName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->analyticsName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->footerButtons:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->footerButtons:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1e

    return v2

    :cond_1e
    return v0
.end method

.method public getAnalyticsName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->analyticsName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCentimetersText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->centimetersText:Ljava/lang/String;

    return-object v0
.end method

.method public final getFeetText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->feetText:Ljava/lang/String;

    return-object v0
.end method

.method public bridge getFooterAlignment()Lcom/whoop/activation/domain/models/FooterAlignment;
    .locals 1

    invoke-super {p0}, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;->getFooterAlignment()Lcom/whoop/activation/domain/models/FooterAlignment;

    move-result-object v0

    return-object v0
.end method

.method public getFooterButtons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->footerButtons:Ljava/util/List;

    return-object v0
.end method

.method public final getHeightCentimetersMaxValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMaxValue:I

    return v0
.end method

.method public final getHeightCentimetersMinValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMinValue:I

    return v0
.end method

.method public final getHeightCentimetersPreselectedValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersPreselectedValue:I

    return v0
.end method

.method public final getHeightFeetMaxValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMaxValue:I

    return v0
.end method

.method public final getHeightFeetMinValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMinValue:I

    return v0
.end method

.method public final getHeightFeetPreselectedValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetPreselectedValue:I

    return v0
.end method

.method public final getHeightTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getImperialTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imperialTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getInchesText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->inchesText:Ljava/lang/String;

    return-object v0
.end method

.method public final getKilogramsText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->kilogramsText:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetricTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->metricTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public getMobileScreenName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->mobileScreenName:Ljava/lang/String;

    return-object v0
.end method

.method public getNavigationBarText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->navigationBarText:Ljava/lang/String;

    return-object v0
.end method

.method public final getPoundsText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->poundsText:Ljava/lang/String;

    return-object v0
.end method

.method public getProgressCircle()Lcom/whoop/design/models/ProgressButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getWeightKilogramsMaxValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMaxValue:I

    return v0
.end method

.method public final getWeightKilogramsMinValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMinValue:I

    return v0
.end method

.method public final getWeightKilogramsPreselectedValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsPreselectedValue:I

    return v0
.end method

.method public final getWeightPoundsMaxValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMaxValue:I

    return v0
.end method

.method public final getWeightPoundsMinValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMinValue:I

    return v0
.end method

.method public final getWeightPoundsPreselectedValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsPreselectedValue:I

    return v0
.end method

.method public final getWeightTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imperialTitle:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->metricTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->feetText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->inchesText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->poundsText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->centimetersText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->kilogramsText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMinValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMaxValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMinValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMaxValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMinValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMaxValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersPreselectedValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMinValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMaxValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsPreselectedValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetPreselectedValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsPreselectedValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->navigationBarText:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->mobileScreenName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->analyticsName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/ProgressButtonModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->footerButtons:Ljava/util/List;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 32

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imperialTitle:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->metricTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightTitle:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightTitle:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->feetText:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->inchesText:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->poundsText:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->centimetersText:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->kilogramsText:Ljava/lang/String;

    iget v10, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMinValue:I

    iget v11, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetMaxValue:I

    iget v12, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMinValue:I

    iget v13, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsMaxValue:I

    iget v14, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMinValue:I

    iget v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersMaxValue:I

    move/from16 v16, v15

    iget v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightCentimetersPreselectedValue:I

    move/from16 v17, v15

    iget v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMinValue:I

    move/from16 v18, v15

    iget v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsMaxValue:I

    move/from16 v19, v15

    iget v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightKilogramsPreselectedValue:I

    move/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->title:Lcom/whoop/design/util/TextResource;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->subtitle:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->imageUrl:Ljava/lang/String;

    move-object/from16 v23, v15

    iget v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->heightFeetPreselectedValue:I

    move/from16 v24, v15

    iget v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->weightPoundsPreselectedValue:I

    move/from16 v25, v15

    iget-object v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->navigationBarText:Ljava/lang/String;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->mobileScreenName:Ljava/lang/String;

    move-object/from16 v27, v15

    iget-object v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->analyticsName:Ljava/lang/String;

    move-object/from16 v28, v15

    iget-object v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    move-object/from16 v29, v15

    iget-object v15, v0, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;->footerButtons:Ljava/util/List;

    const-string v0, ", metricTitle="

    move-object/from16 v30, v15

    const-string v15, ", heightTitle="

    move/from16 v31, v13

    const-string v13, "HeightAndWeightStepModel(imperialTitle="

    invoke-static {v13, v1, v0, v2, v15}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", weightTitle="

    const-string v2, ", feetText="

    invoke-static {v0, v3, v1, v4, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", inchesText="

    const-string v2, ", poundsText="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", centimetersText="

    const-string v2, ", kilogramsText="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", heightFeetMinValue="

    const-string v2, ", heightFeetMaxValue="

    invoke-static {v10, v9, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", weightPoundsMinValue="

    const-string v2, ", weightPoundsMaxValue="

    invoke-static {v0, v11, v1, v12, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", heightCentimetersMinValue="

    const-string v2, ", heightCentimetersMaxValue="

    move/from16 v3, v31

    invoke-static {v0, v3, v1, v14, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", heightCentimetersPreselectedValue="

    const-string v2, ", weightKilogramsMinValue="

    move/from16 v3, v16

    move/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", weightKilogramsMaxValue="

    const-string v2, ", weightKilogramsPreselectedValue="

    move/from16 v3, v18

    move/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", imageUrl="

    const-string v2, ", heightFeetPreselectedValue="

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", weightPoundsPreselectedValue="

    const-string v2, ", navigationBarText="

    move/from16 v3, v24

    move/from16 v4, v25

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", mobileScreenName="

    const-string v2, ", analyticsName="

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", progressCircle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", footerButtons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v30

    invoke-static {v0, v2, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
