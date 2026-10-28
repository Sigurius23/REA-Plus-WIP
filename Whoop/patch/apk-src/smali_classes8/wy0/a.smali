.class public final synthetic Lwy0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:I

.field public final synthetic G:F

.field public final synthetic H:Z

.field public final synthetic I:Lwy0/d;

.field public final synthetic J:J

.field public final synthetic w:F

.field public final synthetic x:Li91/h;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FLi91/h;FFFIFZLwy0/d;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lwy0/a;->w:F

    iput-object p2, p0, Lwy0/a;->x:Li91/h;

    iput p3, p0, Lwy0/a;->y:F

    iput p4, p0, Lwy0/a;->z:F

    iput p5, p0, Lwy0/a;->E:F

    iput p6, p0, Lwy0/a;->F:I

    iput p7, p0, Lwy0/a;->G:F

    iput-boolean p8, p0, Lwy0/a;->H:Z

    iput-object p9, p0, Lwy0/a;->I:Lwy0/d;

    iput-wide p10, p0, Lwy0/a;->J:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-wide v9, p0, Lwy0/a;->J:J

    move-object v11, p1

    check-cast v11, Lk2/e;

    iget v0, p0, Lwy0/a;->w:F

    iget-object v1, p0, Lwy0/a;->x:Li91/h;

    iget v2, p0, Lwy0/a;->y:F

    iget v3, p0, Lwy0/a;->z:F

    iget v4, p0, Lwy0/a;->E:F

    iget v5, p0, Lwy0/a;->F:I

    iget v6, p0, Lwy0/a;->G:F

    iget-boolean v7, p0, Lwy0/a;->H:Z

    iget-object v8, p0, Lwy0/a;->I:Lwy0/d;

    invoke-static/range {v0 .. v11}, Lwy0/c;->b(FLi91/h;FFFIFZLwy0/d;JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
