.class final Lio2/m0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio2/m0;->o(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/a;"
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
.field final synthetic w:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Lio2/p0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lio2/p0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/lang/String;",
            "Lio2/p0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio2/m0$a;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lio2/m0$a;->x:Ljava/lang/String;

    iput-object p3, p0, Lio2/m0$a;->y:Lio2/p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lio2/m0$a;->w:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lio2/i0;

    iget-object v2, p0, Lio2/m0$a;->x:Ljava/lang/String;

    iget-object v3, p0, Lio2/m0$a;->y:Lio2/p0;

    invoke-virtual {v3}, Lio2/p0;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lio2/i0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio2/m0$a;->a()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
