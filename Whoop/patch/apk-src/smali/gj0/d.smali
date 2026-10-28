.class public final Lgj0/d;
.super Lmg/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lgj0/d;",
        "Lmg/a;",
        "<init>",
        "()V",
        "Log/j;",
        "f",
        "Log/j;",
        "c",
        "()Log/j;",
        "loggerProvider",
        "auth_release"
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
.field private final f:Log/j;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lmg/a;-><init>()V

    new-instance v0, Lgj0/c;

    invoke-direct {v0}, Lgj0/c;-><init>()V

    iput-object v0, p0, Lgj0/d;->f:Log/j;

    return-void
.end method


# virtual methods
.method public c()Log/j;
    .locals 1

    iget-object v0, p0, Lgj0/d;->f:Log/j;

    return-object v0
.end method
