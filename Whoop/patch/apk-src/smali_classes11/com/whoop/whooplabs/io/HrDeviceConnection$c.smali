.class final Lcom/whoop/whooplabs/io/HrDeviceConnection$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplabs/io/HrDeviceConnection;->w(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
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
.field final synthetic w:Lcom/whoop/whooplabs/io/HrDeviceConnection;

.field final synthetic x:Lbc3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lbc3/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/io/HrDeviceConnection;",
            "Lbc3/k;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$c;->w:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    iput-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$c;->x:Lbc3/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$c;->w:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    invoke-static {p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->e(Lcom/whoop/whooplabs/io/HrDeviceConnection;)Lbc3/k;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$c;->x:Lbc3/k;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$c;->w:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->m(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lbc3/k;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection$c;->a(Ljava/lang/Throwable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
