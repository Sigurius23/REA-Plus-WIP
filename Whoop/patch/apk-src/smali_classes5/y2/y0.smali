.class public final Ly2/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/compose/ui/Modifier;

.field public final b:Ly2/y;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/node/NodeCoordinator;La3/a2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/y0;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ly2/y0;->b:Ly2/y;

    iput-object p3, p0, Ly2/y0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Landroidx/compose/ui/Modifier;
    .locals 1

    iget-object v0, p0, Ly2/y0;->a:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ModifierInfo("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ly2/y0;->a:Landroidx/compose/ui/Modifier;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ly2/y0;->b:Ly2/y;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly2/y0;->c:Ljava/lang/Object;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Ld13/a;->l(Ljava/lang/StringBuilder;Ljava/lang/Object;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
