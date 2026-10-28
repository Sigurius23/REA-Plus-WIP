.class public final Lb11/k$b;
.super Lb11/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb11/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lb11/k$b;",
        "Lb11/k;",
        "<init>",
        "()V",
        "design_release"
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
.field public static final d:Lb11/k$b;

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb11/k$b;

    invoke-direct {v0}, Lb11/k$b;-><init>()V

    sput-object v0, Lb11/k$b;->d:Lb11/k$b;

    const/16 v0, 0x8

    sput v0, Lb11/k$b;->e:I

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/w;->d()I

    move-result v0

    sget-object v1, Lb11/k$b$a;->w:Lb11/k$b$a;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lb11/k;-><init>(ILy81/e;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
