.class public final Laj2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laj2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u00082\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Laj2/a;",
        "",
        "Lnm0/e;",
        "cachedApiSource",
        "<init>",
        "(Lnm0/e;)V",
        "a",
        "Lnm0/e;",
        "b",
        "strength-workout_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Laj2/a$a;

.field public static final c:I


# instance fields
.field private final a:Lnm0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Laj2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Laj2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Laj2/a;->b:Laj2/a$a;

    const/16 v0, 0x8

    sput v0, Laj2/a;->c:I

    return-void
.end method

.method public constructor <init>(Lnm0/e;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laj2/a;->a:Lnm0/e;

    return-void
.end method
