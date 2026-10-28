.class public final Lsl0/s1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsl0/r1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/s1;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lsl0/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "sl0/s1$a",
        "Lsl0/r1;",
        "Ll83/a0;",
        "a",
        "()V",
        "bot_release"
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
.field final synthetic a:Lh/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/i;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lh/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/i;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/s1$a;->a:Lh/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lsl0/s1$a;->a:Lh/i;

    const-string v1, "application/pdf"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method
