.class public final Lya3/c;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/m;


# static fields
.field public static final x:Lya3/c;


# instance fields
.field public final synthetic w:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lya3/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lya3/c;-><init>(I)V

    sput-object v0, Lya3/c;->x:Lya3/c;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lya3/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lya3/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr93/b;

    check-cast p2, Lr93/b;

    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :pswitch_0
    check-cast p1, Lr93/k;

    check-cast p2, Lr93/k;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
