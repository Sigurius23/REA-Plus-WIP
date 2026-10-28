.class public final synthetic Lqt2/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Landroid/graphics/Typeface;

.field public final synthetic F:J

.field public final synthetic w:J

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:Lqt2/y;


# direct methods
.method public synthetic constructor <init>(JJJLqt2/y;Landroid/graphics/Typeface;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lqt2/z;->w:J

    iput-wide p3, p0, Lqt2/z;->x:J

    iput-wide p5, p0, Lqt2/z;->y:J

    iput-object p7, p0, Lqt2/z;->z:Lqt2/y;

    iput-object p8, p0, Lqt2/z;->E:Landroid/graphics/Typeface;

    iput-wide p9, p0, Lqt2/z;->F:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-wide v8, p0, Lqt2/z;->F:J

    move-object v10, p1

    check-cast v10, Lk2/e;

    iget-wide v0, p0, Lqt2/z;->w:J

    iget-wide v2, p0, Lqt2/z;->x:J

    iget-wide v4, p0, Lqt2/z;->y:J

    iget-object v6, p0, Lqt2/z;->z:Lqt2/y;

    iget-object v7, p0, Lqt2/z;->E:Landroid/graphics/Typeface;

    invoke-static/range {v0 .. v10}, Lqt2/b0;->c(JJJLqt2/y;Landroid/graphics/Typeface;JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
