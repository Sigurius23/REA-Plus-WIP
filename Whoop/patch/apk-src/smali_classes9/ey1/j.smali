.class public abstract Ley1/j;
.super Ljava/lang/Throwable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ley1/j$a;,
        Ley1/j$b;,
        Ley1/j$c;,
        Ley1/j$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\u0008\n\u000b\u000cB\u0011\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u0082\u0001\u0004\r\u000e\u000f\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Ley1/j;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;)V",
        "w",
        "Ljava/lang/String;",
        "a",
        "()Ljava/lang/String;",
        "b",
        "c",
        "d",
        "Ley1/j$a;",
        "Ley1/j$b;",
        "Ley1/j$c;",
        "Ley1/j$d;",
        "metrics_release"
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
.field private final w:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    iput-object p1, p0, Ley1/j;->w:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ley1/j;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ley1/j;->w:Ljava/lang/String;

    return-object v0
.end method
