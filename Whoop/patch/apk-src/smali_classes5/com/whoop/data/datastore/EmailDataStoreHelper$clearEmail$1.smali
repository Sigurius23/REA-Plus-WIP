.class final Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/datastore/EmailDataStoreHelper;->clearEmail(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

.annotation runtime Ls83/e;
    c = "com.whoop.data.datastore.EmailDataStoreHelper"
    f = "EmailDataStoreHelper.kt"
    l = {
        0x4a
    }
    m = "clearEmail"
    v = 0x2
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/whoop/data/datastore/EmailDataStoreHelper;


# direct methods
.method public constructor <init>(Lcom/whoop/data/datastore/EmailDataStoreHelper;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/datastore/EmailDataStoreHelper;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;->this$0:Lcom/whoop/data/datastore/EmailDataStoreHelper;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;->label:I

    iget-object p1, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;->this$0:Lcom/whoop/data/datastore/EmailDataStoreHelper;

    invoke-virtual {p1, p0}, Lcom/whoop/data/datastore/EmailDataStoreHelper;->clearEmail(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
