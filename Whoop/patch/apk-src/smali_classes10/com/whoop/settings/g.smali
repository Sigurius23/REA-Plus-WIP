.class public final synthetic Lcom/whoop/settings/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Lz1/s;

.field public final synthetic y:Lcom/whoop/settings/b;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(ZLz1/s;Lcom/whoop/settings/b;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/whoop/settings/g;->w:Z

    iput-object p2, p0, Lcom/whoop/settings/g;->x:Lz1/s;

    iput-object p3, p0, Lcom/whoop/settings/g;->y:Lcom/whoop/settings/b;

    iput-boolean p4, p0, Lcom/whoop/settings/g;->z:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/whoop/settings/g;->y:Lcom/whoop/settings/b;

    iget-boolean v1, p0, Lcom/whoop/settings/g;->z:Z

    iget-boolean v2, p0, Lcom/whoop/settings/g;->w:Z

    iget-object v3, p0, Lcom/whoop/settings/g;->x:Lz1/s;

    invoke-static {v2, v3, v0, v1}, Lcom/whoop/settings/h;->d(ZLz1/s;Lcom/whoop/settings/b;Z)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
