.class public final Loy2/p$b;
.super Loy2/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loy2/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0005\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Loy2/p$b;",
        "Loy2/p;",
        "<init>",
        "()V",
        "",
        "b",
        "Ljava/lang/Integer;",
        "a",
        "()Ljava/lang/Integer;",
        "seconds",
        "",
        "c",
        "Z",
        "()Z",
        "isCountDown",
        "Lorg/joda/time/DateTime;",
        "d",
        "Lorg/joda/time/DateTime;",
        "()Lorg/joda/time/DateTime;",
        "startTime",
        "whooplabs_release"
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
.field public static final a:Loy2/p$b;

.field private static final b:Ljava/lang/Integer;

.field private static final c:Z

.field private static final d:Lorg/joda/time/DateTime;

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Loy2/p$b;

    invoke-direct {v0}, Loy2/p$b;-><init>()V

    sput-object v0, Loy2/p$b;->a:Loy2/p$b;

    const/16 v0, 0x8

    sput v0, Loy2/p$b;->e:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Loy2/p;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Loy2/p$b;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public b()Lorg/joda/time/DateTime;
    .locals 1

    sget-object v0, Loy2/p$b;->d:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public c()Z
    .locals 1

    sget-boolean v0, Loy2/p$b;->c:Z

    return v0
.end method
