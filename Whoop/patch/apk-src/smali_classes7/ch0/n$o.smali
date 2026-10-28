.class public final Lch0/n$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch0/n;->D(Lch0/v0;Lzg0/i;Landroidx/compose/ui/Modifier;Lf0/r1;FZLandroidx/compose/runtime/Composer;I)V
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
        "ch0/n$o",
        "Lp1/h0;",
        "Ll83/a0;",
        "dispose",
        "()V",
        "runtime"
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
.field final synthetic a:Lp1/c1;

.field final synthetic b:Lch0/v0;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lp1/c1;Lch0/v0;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lch0/n$o;->a:Lp1/c1;

    iput-object p2, p0, Lch0/n$o;->b:Lch0/v0;

    iput-object p3, p0, Lch0/n$o;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 4

    iget-object v0, p0, Lch0/n$o;->a:Lp1/c1;

    invoke-static {v0}, Lch0/n;->c0(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lch0/n$o;->b:Lch0/v0;

    invoke-virtual {v1}, Lch0/v0;->f()Lzg0/h;

    move-result-object v1

    new-instance v2, Lzg0/g$i;

    iget-object v3, p0, Lch0/n$o;->c:Ljava/lang/String;

    invoke-direct {v2, v3, v0}, Lzg0/g$i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lzg0/h;->v(Lzg0/g;)V

    :cond_0
    return-void
.end method
