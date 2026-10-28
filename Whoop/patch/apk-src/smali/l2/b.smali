.class public final Ll2/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Ll2/b;

.field public static final y:Ll2/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Ll2/b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll2/b;-><init>(II)V

    sput-object v0, Ll2/b;->x:Ll2/b;

    new-instance v0, Ll2/b;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll2/b;-><init>(II)V

    sput-object v0, Ll2/b;->y:Ll2/b;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Ll2/b;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Ll2/b;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v1, p1

    check-cast v1, Lk2/e;

    sget-wide v2, Li2/x;->m:J

    const/4 v10, 0x0

    const/16 v11, 0x7e

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lk2/e;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
