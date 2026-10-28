.class public final synthetic Lb30/n4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic w:Lzy/b;

.field public final synthetic x:J

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lzy/b;JZZLc93/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/n4;->w:Lzy/b;

    iput-wide p2, p0, Lb30/n4;->x:J

    iput-boolean p4, p0, Lb30/n4;->y:Z

    iput-boolean p5, p0, Lb30/n4;->z:Z

    iput-object p6, p0, Lb30/n4;->E:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const p1, 0x30001

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-object v0, p0, Lb30/n4;->w:Lzy/b;

    iget-wide v1, p0, Lb30/n4;->x:J

    iget-boolean v3, p0, Lb30/n4;->y:Z

    iget-boolean v4, p0, Lb30/n4;->z:Z

    iget-object v5, p0, Lb30/n4;->E:Lc93/a;

    invoke-static/range {v0 .. v7}, Lkotlin/jvm/internal/j;->h(Lzy/b;JZZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
