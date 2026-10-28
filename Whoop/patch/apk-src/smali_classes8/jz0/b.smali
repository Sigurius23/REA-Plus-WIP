.class public final synthetic Ljz0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Ljz0/d;

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljz0/d;JJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljz0/b;->w:Ljz0/d;

    iput-wide p2, p0, Ljz0/b;->x:J

    iput-wide p4, p0, Ljz0/b;->y:J

    iput p6, p0, Ljz0/b;->z:I

    iput p7, p0, Ljz0/b;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Ljz0/b;->w:Ljz0/d;

    iget-wide v1, p0, Ljz0/b;->x:J

    iget-wide v3, p0, Ljz0/b;->y:J

    iget v5, p0, Ljz0/b;->z:I

    iget v6, p0, Ljz0/b;->E:I

    invoke-static/range {v0 .. v8}, Ljz0/c;->c(Ljz0/d;JJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
