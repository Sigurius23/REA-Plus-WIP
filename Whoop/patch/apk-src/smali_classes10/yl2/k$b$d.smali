.class public final Lyl2/k$b$d;
.super Lyl2/k$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyl2/k$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lyl2/k$b$d;",
        "Lyl2/k$b;",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "action",
        "<init>",
        "(Lc93/a;)V",
        "b",
        "Lc93/a;",
        "a",
        "()Lc93/a;",
        "trends_release"
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
.field private final b:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lyl2/k$b;-><init>(Lc93/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lyl2/k$b$d;->b:Lc93/a;

    return-void
.end method


# virtual methods
.method public a()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lyl2/k$b$d;->b:Lc93/a;

    return-object v0
.end method
