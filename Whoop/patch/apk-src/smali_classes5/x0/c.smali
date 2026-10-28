.class public final Lx0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lx0/c;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx0/c;

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, v1}, Lx0/c;-><init>(Ljava/util/List;)V

    sput-object v0, Lx0/c;->b:Lx0/c;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/c;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    const/16 v1, 0x38

    const-string v2, "\n\t"

    iget-object v3, p0, Lx0/c;->a:Ljava/lang/Object;

    invoke-static {v1, v2, v3, v0}, La4/b;->b(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "TextContextMenuData(components="

    const/16 v2, 0x29

    invoke-static {v2, v1, v0}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
