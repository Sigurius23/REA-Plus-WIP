.class public final Lio/getstream/android/video/generated/infrastructure/LocalDateTimeAdapter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/android/video/generated/infrastructure/LocalDateTimeAdapter;",
        "",
        "<init>",
        "()V",
        "Ljg3/e;",
        "value",
        "",
        "toJson",
        "(Ljg3/e;)Ljava/lang/String;",
        "fromJson",
        "(Ljava/lang/String;)Ljg3/e;",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Ljava/lang/String;)Ljg3/e;
    .locals 2
    .annotation runtime Lqx/p;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llg3/b;->g:Llg3/b;

    sget-object v1, Ljg3/e;->H:Ljg3/e;

    const-string v1, "formatter"

    invoke-static {v0, v1}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljg3/e;->J:Lg73/d;

    invoke-virtual {v0, p1, v1}, Llg3/b;->b(Ljava/lang/CharSequence;Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljg3/e;

    const-string v0, "parse(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final toJson(Ljg3/e;)Ljava/lang/String;
    .locals 1
    .annotation runtime Lqx/t0;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llg3/b;->g:Llg3/b;

    invoke-virtual {v0, p1}, Llg3/b;->a(Lce/w;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "format(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
