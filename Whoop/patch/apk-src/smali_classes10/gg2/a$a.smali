.class public final Lgg2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/g0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgg2/a;-><init>(Landroidx/lifecycle/w;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "gg2/a$a",
        "Landroidx/lifecycle/g0;",
        "Lgg2/a;",
        "w",
        "Lgg2/a;",
        "a",
        "()Lgg2/a;",
        "lifecycle",
        "snapshot-compose-host_release"
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
.field private final w:Lgg2/a;


# direct methods
.method public constructor <init>(Lgg2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgg2/a$a;->w:Lgg2/a;

    return-void
.end method


# virtual methods
.method public a()Lgg2/a;
    .locals 1

    iget-object v0, p0, Lgg2/a$a;->w:Lgg2/a;

    return-object v0
.end method

.method public bridge synthetic getLifecycle()Landroidx/lifecycle/x;
    .locals 1

    invoke-virtual {p0}, Lgg2/a$a;->a()Lgg2/a;

    move-result-object v0

    return-object v0
.end method
