.class public final synthetic Landroidx/profileinstaller/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;ILjava/lang/Object;I)V
    .locals 0

    iput p4, p0, Landroidx/profileinstaller/c;->w:I

    iput-object p1, p0, Landroidx/profileinstaller/c;->x:Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;

    iput p2, p0, Landroidx/profileinstaller/c;->y:I

    iput-object p3, p0, Landroidx/profileinstaller/c;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Landroidx/profileinstaller/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Landroidx/profileinstaller/c;->y:I

    iget-object v1, p0, Landroidx/profileinstaller/c;->z:Ljava/lang/Object;

    iget-object v2, p0, Landroidx/profileinstaller/c;->x:Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;

    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/ProfileInstaller;->b(Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;ILjava/lang/Object;)V

    return-void

    :pswitch_0
    iget v0, p0, Landroidx/profileinstaller/c;->y:I

    iget-object v1, p0, Landroidx/profileinstaller/c;->z:Ljava/lang/Object;

    iget-object v2, p0, Landroidx/profileinstaller/c;->x:Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;

    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/ProfileInstaller;->a(Landroidx/profileinstaller/ProfileInstaller$DiagnosticsCallback;ILjava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
