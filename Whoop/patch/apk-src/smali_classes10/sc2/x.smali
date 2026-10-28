.class public final synthetic Lsc2/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lsc2/y;


# direct methods
.method public synthetic constructor <init>(Lsc2/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc2/x;->a:Lsc2/y;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object v0, p0, Lsc2/x;->a:Lsc2/y;

    invoke-static {v0, p1, p2}, Lsc2/y;->H(Lsc2/y;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
