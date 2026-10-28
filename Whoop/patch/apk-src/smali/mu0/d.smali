.class public final synthetic Lmu0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:J

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IJJIJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lmu0/d;->w:I

    iput-wide p2, p0, Lmu0/d;->x:J

    iput-wide p4, p0, Lmu0/d;->y:J

    iput p6, p0, Lmu0/d;->z:I

    iput-wide p7, p0, Lmu0/d;->E:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-wide v6, p0, Lmu0/d;->E:J

    move-object v8, p1

    check-cast v8, Ltb/a;

    iget v0, p0, Lmu0/d;->w:I

    iget-wide v1, p0, Lmu0/d;->x:J

    iget-wide v3, p0, Lmu0/d;->y:J

    iget v5, p0, Lmu0/d;->z:I

    invoke-static/range {v0 .. v8}, Lmu0/e;->l(IJJIJLtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
