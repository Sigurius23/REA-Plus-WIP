.class public final synthetic Ltq0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lcom/whoop/community/presentation/ui/PillRadioGroup;

.field public final synthetic b:Landroid/widget/RadioButton;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/ui/PillRadioGroup;Landroid/widget/RadioButton;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq0/a;->a:Lcom/whoop/community/presentation/ui/PillRadioGroup;

    iput-object p2, p0, Ltq0/a;->b:Landroid/widget/RadioButton;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    iget-object v0, p0, Ltq0/a;->a:Lcom/whoop/community/presentation/ui/PillRadioGroup;

    iget-object v1, p0, Ltq0/a;->b:Landroid/widget/RadioButton;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/community/presentation/ui/PillRadioGroup;->b(Lcom/whoop/community/presentation/ui/PillRadioGroup;Landroid/widget/RadioButton;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
