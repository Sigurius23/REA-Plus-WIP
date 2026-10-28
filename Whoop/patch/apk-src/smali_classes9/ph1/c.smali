.class public final synthetic Lph1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lcom/whoop/gifting/feature/gifting/view/GiftingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/gifting/feature/gifting/view/GiftingFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lph1/c;->w:Lcom/whoop/gifting/feature/gifting/view/GiftingFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lph1/c;->w:Lcom/whoop/gifting/feature/gifting/view/GiftingFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/gifting/feature/gifting/view/GiftingFragment;->y(Lcom/whoop/gifting/feature/gifting/view/GiftingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
