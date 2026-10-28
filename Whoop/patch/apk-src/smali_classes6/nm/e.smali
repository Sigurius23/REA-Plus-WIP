.class public final Lnm/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lim/b;


# instance fields
.field public final synthetic w:I

.field public final x:Lk83/a;


# direct methods
.method public synthetic constructor <init>(Lk83/a;I)V
    .locals 0

    iput p2, p0, Lnm/e;->w:I

    iput-object p1, p0, Lnm/e;->x:Lk83/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lnm/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lnm/e;->x:Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    sget v1, Lnm/k;->z:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    new-instance v2, Lnm/k;

    const-string v3, "com.google.android.datatransport.events"

    invoke-direct {v2, v0, v3, v1}, Lnm/k;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    return-object v2

    :pswitch_0
    iget-object v0, p0, Lnm/e;->x:Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
