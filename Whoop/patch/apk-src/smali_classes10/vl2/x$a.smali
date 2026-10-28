.class public final Lvl2/x$a;
.super Lvl2/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvl2/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0011\u001a\u0004\u0008\n\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lvl2/x$a;",
        "Lvl2/x;",
        "Lvl2/a;",
        "duration",
        "Lor2/h0;",
        "graphKey",
        "",
        "date",
        "<init>",
        "(Lvl2/a;Lor2/h0;Ljava/lang/String;)V",
        "a",
        "Lvl2/a;",
        "b",
        "()Lvl2/a;",
        "Lor2/h0;",
        "c",
        "()Lor2/h0;",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
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
.field private final a:Lvl2/a;

.field private final b:Lor2/h0;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lvl2/a;Lor2/h0;Ljava/lang/String;)V
    .locals 1

    const-string v0, "duration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graphKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "date"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lvl2/x;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lvl2/x$a;->a:Lvl2/a;

    iput-object p2, p0, Lvl2/x$a;->b:Lor2/h0;

    iput-object p3, p0, Lvl2/x$a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvl2/x$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lvl2/a;
    .locals 1

    iget-object v0, p0, Lvl2/x$a;->a:Lvl2/a;

    return-object v0
.end method

.method public final c()Lor2/h0;
    .locals 1

    iget-object v0, p0, Lvl2/x$a;->b:Lor2/h0;

    return-object v0
.end method
