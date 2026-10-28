.class public Lcom/whoop/ui/h$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private a:Lcom/whoop/ui/h;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/whoop/ui/h;->S()Lcom/whoop/ui/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/h$d;->a:Lcom/whoop/ui/h;

    return-void
.end method


# virtual methods
.method public a()Lcom/whoop/ui/h$d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/h$d;->a:Lcom/whoop/ui/h;

    invoke-static {v0}, Lcom/whoop/ui/h;->H(Lcom/whoop/ui/h;)V

    return-object p0
.end method

.method public b()Lcom/whoop/ui/h;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/h$d;->a:Lcom/whoop/ui/h;

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/whoop/ui/h$d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/h$d;->a:Lcom/whoop/ui/h;

    invoke-static {v0, p1}, Lcom/whoop/ui/h;->I(Lcom/whoop/ui/h;Ljava/lang/String;)V

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/whoop/ui/h$d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/h$d;->a:Lcom/whoop/ui/h;

    invoke-static {v0, p1}, Lcom/whoop/ui/h;->J(Lcom/whoop/ui/h;Ljava/lang/String;)V

    return-object p0
.end method
