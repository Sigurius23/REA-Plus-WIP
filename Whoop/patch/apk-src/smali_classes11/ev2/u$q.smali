.class final Lev2/u$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lev2/u;->d1(Ljava/util/List;Ljava/util/Set;Lcv2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic w:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic x:Lcom/whoop/weightlifting/data/domain/FilterItem;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/weightlifting/data/domain/FilterItem;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lev2/u$q;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lev2/u$q;->x:Lcom/whoop/weightlifting/data/domain/FilterItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    iget-object p1, p0, Lev2/u$q;->w:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lev2/u$q;->x:Lcom/whoop/weightlifting/data/domain/FilterItem;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lev2/u$q;->a(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
