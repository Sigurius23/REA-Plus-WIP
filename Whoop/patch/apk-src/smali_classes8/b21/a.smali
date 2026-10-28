.class public final synthetic Lb21/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:J

.field public final synthetic w:Z

.field public final synthetic x:Ld0/z1;

.field public final synthetic y:Ll83/k;

.field public final synthetic z:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(JLd0/z1;Ljava/util/List;Ll83/k;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p6, p0, Lb21/a;->w:Z

    iput-object p3, p0, Lb21/a;->x:Ld0/z1;

    iput-object p5, p0, Lb21/a;->y:Ll83/k;

    iput-object p4, p0, Lb21/a;->z:Ljava/util/List;

    iput-wide p1, p0, Lb21/a;->E:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v6, p1

    check-cast v6, Ll0/v;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v0, p0, Lb21/a;->w:Z

    iget-object v1, p0, Lb21/a;->x:Ld0/z1;

    iget-object v2, p0, Lb21/a;->y:Ll83/k;

    iget-object v3, p0, Lb21/a;->z:Ljava/util/List;

    iget-wide v4, p0, Lb21/a;->E:J

    invoke-static/range {v0 .. v8}, Lb21/d;->b(ZLd0/z1;Ll83/k;Ljava/util/List;JLl0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
