.class public final Loy2/b$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loy2/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loy2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "l"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Loy2/b$l;",
        "Loy2/b;",
        "<init>",
        "()V",
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
.field public static final a:Loy2/b$l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Loy2/b$l;

    invoke-direct {v0}, Loy2/b$l;-><init>()V

    sput-object v0, Loy2/b$l;->a:Loy2/b$l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge e(Loy2/b$f;Z)Loy2/b$f;
    .locals 0

    invoke-super {p0, p1, p2}, Loy2/b;->e(Loy2/b$f;Z)Loy2/b$f;

    move-result-object p1

    return-object p1
.end method

.method public bridge f(Loy2/b$f;Z)Loy2/b$f;
    .locals 0

    invoke-super {p0, p1, p2}, Loy2/b;->f(Loy2/b$f;Z)Loy2/b$f;

    move-result-object p1

    return-object p1
.end method
