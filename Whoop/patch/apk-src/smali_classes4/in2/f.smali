.class public final Lin2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lin2/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lin2/g<",
        "Ll73/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000c\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u000b\u0010\u0008R\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0006\u001a\u0004\u0008\u000e\u0010\u0008\u00a8\u0006\u0010"
    }
    d2 = {
        "Lin2/f;",
        "Lin2/g;",
        "Ll73/g;",
        "<init>",
        "()V",
        "b",
        "Ll73/g;",
        "getMain",
        "()Ll73/g;",
        "main",
        "c",
        "getIo",
        "io",
        "d",
        "getComputation",
        "computation",
        "app_prodStandardRelease"
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
.field public static final a:Lin2/f;

.field private static final b:Ll73/g;

.field private static final c:Ll73/g;

.field private static final d:Ll73/g;

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lin2/f;

    invoke-direct {v0}, Lin2/f;-><init>()V

    sput-object v0, Lin2/f;->a:Lin2/f;

    sget-object v0, Lm73/b;->a:Lm73/e;

    if-eqz v0, :cond_0

    sput-object v0, Lin2/f;->b:Ll73/g;

    sget-object v0, Lf83/f;->b:Ll73/g;

    const-string v1, "io(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lin2/f;->c:Ll73/g;

    sget-object v0, Lf83/f;->a:Ll73/g;

    const-string v1, "computation(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lin2/f;->d:Ll73/g;

    const/16 v0, 0x8

    sput v0, Lin2/f;->e:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "scheduler == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
