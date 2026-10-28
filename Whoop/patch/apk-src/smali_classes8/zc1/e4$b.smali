.class final Lzc1/e4$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc1/e4;->j(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lzc1/e4$b;->w:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 2

    iget-object v0, p0, Lzc1/e4$b;->w:Lp1/c1;

    new-instance v1, Li2/x;

    invoke-direct {v1, p1, p2}, Li2/x;-><init>(J)V

    invoke-interface {v0, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Li2/x;

    iget-wide v0, p1, Li2/x;->a:J

    invoke-virtual {p0, v0, v1}, Lzc1/e4$b;->a(J)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
