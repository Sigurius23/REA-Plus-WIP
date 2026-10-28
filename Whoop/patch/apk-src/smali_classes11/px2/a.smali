.class public abstract Lpx2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpx2/a$a;,
        Lpx2/a$b;,
        Lpx2/a$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00152\u00020\u0001:\u0003\u000e\u000b\u0012B)\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0013\u001a\u0004\u0008\u000e\u0010\u0014\u0082\u0001\u0002\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpx2/a;",
        "",
        "",
        "icon",
        "",
        "title",
        "Ly81/e;",
        "iconColor",
        "iconBackgroundColor",
        "<init>",
        "(ILjava/lang/String;Ly81/e;Ly81/e;)V",
        "a",
        "I",
        "()I",
        "b",
        "Ljava/lang/String;",
        "d",
        "()Ljava/lang/String;",
        "c",
        "Ly81/e;",
        "()Ly81/e;",
        "e",
        "Lpx2/a$a;",
        "Lpx2/a$b;",
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
.field public static final e:Lpx2/a$c;

.field public static final f:I


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ly81/e;

.field private final d:Ly81/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpx2/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpx2/a$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpx2/a;->e:Lpx2/a$c;

    const/16 v0, 0x8

    sput v0, Lpx2/a;->f:I

    return-void
.end method

.method private constructor <init>(ILjava/lang/String;Ly81/e;Ly81/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lpx2/a;->a:I

    .line 4
    iput-object p2, p0, Lpx2/a;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lpx2/a;->c:Ly81/e;

    .line 6
    iput-object p4, p0, Lpx2/a;->d:Ly81/e;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ly81/e;Ly81/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lpx2/a;-><init>(ILjava/lang/String;Ly81/e;Ly81/e;)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lpx2/a;->a:I

    return v0
.end method

.method public final b()Ly81/e;
    .locals 1

    iget-object v0, p0, Lpx2/a;->d:Ly81/e;

    return-object v0
.end method

.method public final c()Ly81/e;
    .locals 1

    iget-object v0, p0, Lpx2/a;->c:Ly81/e;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpx2/a;->b:Ljava/lang/String;

    return-object v0
.end method
