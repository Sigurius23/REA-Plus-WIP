.class public final synthetic Lmp0/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TimePicker$OnTimeChangedListener;


# instance fields
.field public final synthetic a:Lmp0/w0;


# direct methods
.method public synthetic constructor <init>(Lmp0/w0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp0/v0;->a:Lmp0/w0;

    return-void
.end method


# virtual methods
.method public final onTimeChanged(Landroid/widget/TimePicker;II)V
    .locals 1

    iget-object v0, p0, Lmp0/v0;->a:Lmp0/w0;

    invoke-static {v0, p1, p2, p3}, Lmp0/w0;->L(Lmp0/w0;Landroid/widget/TimePicker;II)V

    return-void
.end method
