.class public abstract Lh62/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh62/a$a;,
        Lh62/a$b;,
        Lh62/a$c;,
        Lh62/a$d;,
        Lh62/a$e;,
        Lh62/a$f;,
        Lh62/a$g;,
        Lh62/a$h;,
        Lh62/a$i;,
        Lh62/a$j;,
        Lh62/a$k;,
        Lh62/a$l;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0010$\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u000c\u0014\u0015\u0007\u0016\u0017\u0005\u000e\r\u000b\u0018\u0019\u001aB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0008R\u001a\u0010\u000c\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0006\u001a\u0004\u0008\u000b\u0010\u0008R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0006\u001a\u0004\u0008\u000e\u0010\u0008R*\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00108\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0011\u001a\u0004\u0008\r\u0010\u0012\u0082\u0001\u000c\u001b\u001c\u001d\u001e\u001f !\"#$%&\u00a8\u0006\'"
    }
    d2 = {
        "Lh62/a;",
        "",
        "<init>",
        "()V",
        "",
        "a",
        "Ljava/lang/String;",
        "b",
        "()Ljava/lang/String;",
        "category",
        "action",
        "c",
        "eventName",
        "d",
        "e",
        "value",
        "",
        "Ljava/util/Map;",
        "()Ljava/util/Map;",
        "otherProperties",
        "k",
        "f",
        "g",
        "l",
        "h",
        "j",
        "i",
        "Lh62/a$a;",
        "Lh62/a$b;",
        "Lh62/a$c;",
        "Lh62/a$d;",
        "Lh62/a$e;",
        "Lh62/a$f;",
        "Lh62/a$g;",
        "Lh62/a$h;",
        "Lh62/a$i;",
        "Lh62/a$j;",
        "Lh62/a$k;",
        "Lh62/a$l;",
        "refer-a-friend_release"
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

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, ""

    iput-object v0, p0, Lh62/a;->a:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lh62/a;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh62/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh62/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh62/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lh62/a;->e:Ljava/util/Map;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh62/a;->d:Ljava/lang/String;

    return-object v0
.end method
