.class public final synthetic Lmp0/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lmp0/s0;

.field public final synthetic b:Lgf2/s;


# direct methods
.method public synthetic constructor <init>(Lmp0/s0;Lgf2/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp0/r0;->a:Lmp0/s0;

    iput-object p2, p0, Lmp0/r0;->b:Lgf2/s;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 2

    iget-object v0, p0, Lmp0/r0;->a:Lmp0/s0;

    iget-object v1, p0, Lmp0/r0;->b:Lgf2/s;

    invoke-static {v0, v1, p1, p2}, Lmp0/s0;->K(Lmp0/s0;Lgf2/s;Landroid/widget/RadioGroup;I)V

    return-void
.end method
