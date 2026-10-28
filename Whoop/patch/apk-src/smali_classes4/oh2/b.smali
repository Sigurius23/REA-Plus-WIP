.class public interface abstract Loh2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loh2/b$a;,
        Loh2/b$b;,
        Loh2/b$c;,
        Loh2/b$d;,
        Loh2/b$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u0000 \u00032\u00020\u0001:\u0005\u0007\u0008\t\n\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0004\u0082\u0001\u0003\u000b\u000c\r\u00a8\u0006\u000e\u00c0\u0006\u0003"
    }
    d2 = {
        "Loh2/b;",
        "",
        "",
        "a",
        "()Ljava/lang/String;",
        "h",
        "raw",
        "b",
        "d",
        "e",
        "c",
        "Loh2/b$b;",
        "Loh2/b$d;",
        "Loh2/b$e;",
        "connectivity-data-packets-model_release"
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
.field public static final a:Loh2/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Loh2/b$a;->w:Loh2/b$a;

    sput-object v0, Loh2/b;->a:Loh2/b$a;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    invoke-interface {p0}, Loh2/b;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract h()Ljava/lang/String;
.end method
