.class public final Lyg1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyg1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lyg1/b;",
        "",
        "Ltr2/n;",
        "logger",
        "Lci2/b;",
        "whoopStrapProvider",
        "<init>",
        "(Ltr2/n;Lci2/b;)V",
        "a",
        "Ltr2/n;",
        "Lec3/l;",
        "Lyg1/a;",
        "b",
        "Lec3/l;",
        "getFirmwareUpdateStatusFlow",
        "()Lec3/l;",
        "firmwareUpdateStatusFlow",
        "firmware-feature-flag_release"
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
.field private final a:Ltr2/n;

.field private final b:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltr2/n;Lci2/b;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyg1/b;->a:Ltr2/n;

    invoke-interface {p2}, Lci2/b;->c()Lec3/f2;

    move-result-object p1

    new-instance p2, Lch/i;

    const/4 v0, 0x2

    invoke-direct {p2, p1, v0}, Lch/i;-><init>(Lec3/l;I)V

    new-instance p1, Lyg1/b$c;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lyg1/b$c;-><init>(Lq83/d;)V

    invoke-static {p2, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance p2, Lyg1/b$d;

    invoke-direct {p2, p1, v0}, Lyg1/b$d;-><init>(Lec3/l;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, p2}, Lec3/s1;-><init>(Lc93/m;)V

    new-instance p2, Lyg1/b$b;

    invoke-direct {p2, v0}, Lyg1/b$b;-><init>(Lq83/d;)V

    new-instance v0, Lec3/a0;

    invoke-direct {v0, p2, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    invoke-static {v0}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lyg1/b;->b:Lec3/l;

    return-void
.end method
