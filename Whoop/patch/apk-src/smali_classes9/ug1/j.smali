.class public abstract Lug1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug1/j$a;,
        Lug1/j$b;,
        Lug1/j$c;,
        Lug1/j$d;,
        Lug1/j$e;,
        Lug1/j$f;,
        Lug1/j$g;,
        Lug1/j$h;,
        Lug1/j$i;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u0001:\t\n\u000b\u000c\r\u000e\u0008\u000f\u0010\u0011B\u0011\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u0082\u0001\t\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lug1/j;",
        "",
        "",
        "state",
        "<init>",
        "(Ljava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "a",
        "Ljava/lang/String;",
        "h",
        "f",
        "g",
        "e",
        "b",
        "i",
        "c",
        "d",
        "Lug1/j$a;",
        "Lug1/j$b;",
        "Lug1/j$c;",
        "Lug1/j$d;",
        "Lug1/j$e;",
        "Lug1/j$f;",
        "Lug1/j$g;",
        "Lug1/j$h;",
        "Lug1/j$i;",
        "firmware-update-service_release"
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
.field private final a:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lug1/j;->a:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lug1/j;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lug1/j;->a:Ljava/lang/String;

    return-object v0
.end method
