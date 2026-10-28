.class public final synthetic Lga0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:Lga0/c;

.field public final synthetic x:Lcom/whoop/addactivity/network/CreateActivityRequest;

.field public final synthetic y:I

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lga0/c;Lcom/whoop/addactivity/network/CreateActivityRequest;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lga0/a;->w:Lga0/c;

    iput-object p2, p0, Lga0/a;->x:Lcom/whoop/addactivity/network/CreateActivityRequest;

    iput p3, p0, Lga0/a;->y:I

    iput-boolean p4, p0, Lga0/a;->z:Z

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 4

    iget-boolean v0, p0, Lga0/a;->z:Z

    check-cast p1, Lxg3/q;

    iget-object v1, p0, Lga0/a;->w:Lga0/c;

    iget-object v2, p0, Lga0/a;->x:Lcom/whoop/addactivity/network/CreateActivityRequest;

    iget v3, p0, Lga0/a;->y:I

    invoke-static {v1, v2, v3, v0, p1}, Lga0/c;->a(Lga0/c;Lcom/whoop/addactivity/network/CreateActivityRequest;IZLxg3/q;)V

    return-void
.end method
