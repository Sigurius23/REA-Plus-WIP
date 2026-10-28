.class public abstract Lvj1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvj1/a$a;,
        Lvj1/a$b;,
        Lvj1/a$c;,
        Lvj1/a$d;,
        Lvj1/a$e;,
        Lvj1/a$f;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\u000c\r\u0006B\u0011\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lvj1/a;",
        "",
        "Lvj1/d;",
        "data",
        "<init>",
        "(Lvj1/d;)V",
        "a",
        "Lvj1/d;",
        "()Lvj1/d;",
        "c",
        "b",
        "f",
        "d",
        "e",
        "Lvj1/a$a;",
        "Lvj1/a$b;",
        "Lvj1/a$c;",
        "Lvj1/a$d;",
        "Lvj1/a$e;",
        "Lvj1/a$f;",
        "health-monitor_release"
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
.field private final a:Lvj1/d;


# direct methods
.method private constructor <init>(Lvj1/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvj1/a;->a:Lvj1/d;

    return-void
.end method

.method public synthetic constructor <init>(Lvj1/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lvj1/a;-><init>(Lvj1/d;)V

    return-void
.end method


# virtual methods
.method public final a()Lvj1/d;
    .locals 1

    iget-object v0, p0, Lvj1/a;->a:Lvj1/d;

    return-object v0
.end method
