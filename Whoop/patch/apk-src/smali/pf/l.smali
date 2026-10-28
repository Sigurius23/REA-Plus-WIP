.class public final synthetic Lpf/l;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lpf/l;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lpf/l;

    const-string v4, "DefaultHttpEngine(Lkotlin/jvm/functions/Function1;)Laws/smithy/kotlin/runtime/http/engine/CloseableHttpClientEngine;"

    const/4 v5, 0x1

    const/4 v1, 0x1

    const-class v2, Lpf/c;

    const-string v3, "DefaultHttpEngine"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lpf/l;->w:Lpf/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lse/h;->Q(Lkotlin/jvm/functions/Function1;)Lrf/o;

    move-result-object p1

    return-object p1
.end method
