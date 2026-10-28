.class public final synthetic Ll1/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Z

.field public final synthetic G:Ljava/lang/String;

.field public final synthetic H:Ll1/y;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLc93/a;ZLjava/lang/String;Ll1/y;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/n0;->w:Ljava/lang/String;

    iput-object p2, p0, Ll1/n0;->x:Landroidx/compose/ui/Modifier;

    iput-boolean p3, p0, Ll1/n0;->y:Z

    iput-boolean p4, p0, Ll1/n0;->z:Z

    iput-object p5, p0, Ll1/n0;->E:Lc93/a;

    iput-boolean p6, p0, Ll1/n0;->F:Z

    iput-object p7, p0, Ll1/n0;->G:Ljava/lang/String;

    iput-object p8, p0, Ll1/n0;->H:Ll1/y;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x31

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget-object v0, p0, Ll1/n0;->w:Ljava/lang/String;

    iget-object v1, p0, Ll1/n0;->x:Landroidx/compose/ui/Modifier;

    iget-boolean v2, p0, Ll1/n0;->y:Z

    iget-boolean v3, p0, Ll1/n0;->z:Z

    iget-object v4, p0, Ll1/n0;->E:Lc93/a;

    iget-boolean v5, p0, Ll1/n0;->F:Z

    iget-object v6, p0, Ll1/n0;->G:Ljava/lang/String;

    iget-object v7, p0, Ll1/n0;->H:Ll1/y;

    invoke-static/range {v0 .. v9}, Ll1/f1;->m(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLc93/a;ZLjava/lang/String;Ll1/y;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
