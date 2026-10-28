.class public final synthetic Lpm2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lcom/whoop/ui/drawer/strapsettings/advancedsettings/AdvancedStrapFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/ui/drawer/strapsettings/advancedsettings/AdvancedStrapFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpm2/c;->w:Lcom/whoop/ui/drawer/strapsettings/advancedsettings/AdvancedStrapFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lpm2/c;->w:Lcom/whoop/ui/drawer/strapsettings/advancedsettings/AdvancedStrapFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/advancedsettings/AdvancedStrapFragment;->S(Lcom/whoop/ui/drawer/strapsettings/advancedsettings/AdvancedStrapFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
