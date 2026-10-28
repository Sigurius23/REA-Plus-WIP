.class public final Lnu2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u000e\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lnu2/f;",
        "",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lzr2/a;)V",
        "Lec3/l;",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "upstream",
        "",
        "b",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lzr2/a;",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lzr2/a;


# direct methods
.method public constructor <init>(Lzr2/a;)V
    .locals 1

    const-string v0, "dateAndTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnu2/f;->a:Lzr2/a;

    return-void
.end method

.method public static final synthetic a(Lnu2/f;)Lzr2/a;
    .locals 0

    iget-object p0, p0, Lnu2/f;->a:Lzr2/a;

    return-object p0
.end method


# virtual methods
.method public final b(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnu2/f$b;

    invoke-direct {v0, p1}, Lnu2/f$b;-><init>(Lec3/l;)V

    invoke-static {v0}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Lnu2/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lnu2/f$a;-><init>(Lq83/d;Lnu2/f;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
